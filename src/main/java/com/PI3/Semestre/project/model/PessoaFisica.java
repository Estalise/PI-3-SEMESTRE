package com.PI3.Semestre.project.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FISICA")
public class PessoaFisica extends Pessoa {
    public PessoaFisica() { super(); }
    // nenhum atributo adicional (cpf já na super)
}