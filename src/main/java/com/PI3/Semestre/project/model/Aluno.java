package com.PI3.Semestre.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("ALUNO")
public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno() { super(); }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
}
