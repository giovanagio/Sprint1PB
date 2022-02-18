package com.company;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question usuario = new Question();
        System.out.println("----------------------------");
        System.out.println("BEM VINDO AO QUIZZ PB COMPASS");
        System.out.println("----------------------------");
        System.out.println("Digite seu nome, por favor\n");
        usuario.setName(sc.next());
        Game g = new Game();
        g.start();
        System.out.println("Nome: " + usuario.getName());
    }
}
