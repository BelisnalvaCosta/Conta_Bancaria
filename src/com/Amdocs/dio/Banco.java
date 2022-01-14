package com.Amdocs.dio;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> Contas;
    private String contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> Contas) {
        this.contas = contas;
    }

}
