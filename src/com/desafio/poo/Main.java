package com.desafio.poo;

import com.desafio.poo.dominio.Curso;
import com.desafio.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Curso curso1 = new Curso("Curso Java", "descrição curso Java", 8); //instancia um novo curso através do Constructor;
        System.out.println(curso1);

        Curso curso2 = new Curso("Curso Js", "Curso de JavaScript", 4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "bootcamp Spread", LocalDate.now());
        System.out.println(mentoria);
    }
}
