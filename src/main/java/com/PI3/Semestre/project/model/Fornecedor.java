package com.PI3.Semestre.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("FORNECEDOR")
public class Fornecedor extends PessoaJuridica {
    private String tipoProduto;
    private String contatoComercial;

    public Fornecedor() { super(); }

    public String getTipoProduto() { return tipoProduto; }
    public void setTipoProduto(String tipoProduto) { this.tipoProduto = tipoProduto; }
    public String getContatoComercial() { return contatoComercial; }
    public void setContatoComercial(String contatoComercial) { this.contatoComercial = contatoComercial; }
}
