package com.PI3.Semestre.project.controller;

import com.PI3.Semestre.project.model.*;
import com.PI3.Semestre.project.service.PessoaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pessoas", service.listarTodos());
        return "pessoas/list";
    }

    @GetMapping("/novo")
    public String novoMenu() {
        return "pessoas/index";
    }

    // ========== FORMULÁRIOS ==========
    @GetMapping("/novo/fisica")
    public String novoFisica(Model model) {
        model.addAttribute("pessoa", new PessoaFisica());
        return "pessoas/form-fisica";
    }

    @GetMapping("/novo/juridica")
    public String novoJuridica(Model model) {
        model.addAttribute("pessoa", new PessoaJuridica());
        return "pessoas/form-juridica";
    }

    @GetMapping("/novo/aluno")
    public String novoAluno(Model model) {
        model.addAttribute("pessoa", new Aluno());
        return "pessoas/form-aluno";
    }

    @GetMapping("/novo/professor")
    public String novoProfessor(Model model) {
        model.addAttribute("pessoa", new Professor());
        return "pessoas/form-professor";
    }

    @GetMapping("/novo/fornecedor")
    public String novoFornecedor(Model model) {
        model.addAttribute("pessoa", new Fornecedor());
        return "pessoas/form-fornecedor";
    }

    // ========== SALVAR POR TIPO ==========
    @PostMapping("/salvar/fisica")
    public String salvarFisica(@ModelAttribute PessoaFisica pessoa) {
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @PostMapping("/salvar/juridica")
    public String salvarJuridica(@ModelAttribute PessoaJuridica pessoa) {
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @PostMapping("/salvar/aluno")
    public String salvarAluno(@ModelAttribute Aluno pessoa) {
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @PostMapping("/salvar/professor")
    public String salvarProfessor(@ModelAttribute Professor pessoa) {
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @PostMapping("/salvar/fornecedor")
    public String salvarFornecedor(@ModelAttribute Fornecedor pessoa) {
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    // ========== EXCLUIR / EDITAR ==========
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/pessoas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        var opt = service.buscarPorId(id);
        if (opt.isPresent()) {
            Pessoa p = opt.get();
            model.addAttribute("pessoa", p);

            if (p instanceof PessoaFisica) return "pessoas/form-fisica";
            if (p instanceof PessoaJuridica) return "pessoas/form-juridica";
            if (p instanceof Aluno) return "pessoas/form-aluno";
            if (p instanceof Professor) return "pessoas/form-professor";
            if (p instanceof Fornecedor) return "pessoas/form-fornecedor";
        }
        return "redirect:/pessoas";
    }
}
