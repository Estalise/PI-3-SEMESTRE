package com.PI3.Semestre.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;      // pode ser nulo para Pessoa Jurídica
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa() {}

    // ===================== GETTERS E SETTERS =====================

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // ===================== MÉTODO EXTRA =====================

    @Transient
    public String getTipo() {
        // Retorna o nome simples da subclasse (ex: "Aluno", "Professor", etc)
        return this.getClass().getSimpleName();
    }
}
