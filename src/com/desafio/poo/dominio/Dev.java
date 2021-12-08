package com.desafio.poo.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev extends Pessoa {

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();//vai salvar o conteúdo em ordem
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome, String cidade, Integer idade, Set<Conteudo> conteudosInscritos, Set<Conteudo> conteudosConcluidos) {
        super(nome, cidade, idade);
        this.conteudosInscritos = conteudosInscritos;
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {

    }

    public void progredir() {

    }

    public void calcularTotalXp() {

    }

    public void exibirCursos() {

    }
}

