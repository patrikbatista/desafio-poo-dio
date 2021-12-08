package com.desafio.poo.dominio;

public abstract class Pessoa {
    private String nome;
    private String cidade;
    private Integer idade;

    public Pessoa(String nome, String cidade, Integer idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
