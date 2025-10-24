package com.PI3.Semestre.project.service;

import com.PI3.Semestre.project.model.Pessoa;
import com.PI3.Semestre.project.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repo;



    public PessoaService(PessoaRepository repo) {
        this.repo = repo;
    }

    public List<Pessoa> listarTodos() {
        return repo.findAll();
    }

    public Optional<Pessoa> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public List<Pessoa> buscarPorNome(String nome) {
        return repo.findByNomeContainingIgnoreCase(nome);
    }

    public Pessoa salvar(Pessoa p) {
        return repo.save(p);
    }

    public void excluir(Long id) {
        repo.deleteById(id);
    }

    public boolean existeCpf(String cpf) {
        return cpf != null && repo.existsByCpf(cpf);
    }

    //public boolean existeCnpj(String cnpj) {
        //return cnpj != null && repo.existsByCnpj(cnpj);
    //}


}
