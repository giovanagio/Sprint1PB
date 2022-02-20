package com.company;

import java.util.*;
import java.text.SimpleDateFormat;


public class Sistema {

    public static void main(String[] args) {

        //Buscando a hora atual e fazendo sua transformação para inteiro
        Date dataHoraAtual = new Date();
        String horarioAgora = new SimpleDateFormat("HH").format(dataHoraAtual);
        int horaParaUtilizar = Integer.parseInt(horarioAgora);

        //Cadastrando 2 usuários no sistema de cadastro para login
        Scanner sc = new Scanner(System.in);
        List<String> usuariosCadastrados = new ArrayList<>();
        usuariosCadastrados.add("compass");
        usuariosCadastrados.add("felype");
        List<String> senhasCadastradas = new ArrayList<>();
        senhasCadastradas.add("12345");
        senhasCadastradas.add("010203");

        //Pedindo ao usuário login e senha para entrar no sistema
        System.out.println("-------------------------");
        System.out.println("SISTEMA COMPASS DE ACESSO");
        System.out.println("-------------------------");
        System.out.println("Digite seu login:");
        String usuarioLogin = sc.next().toLowerCase();
        System.out.println("Digite sua senha:");
        String usuarioSenha = sc.next().toLowerCase();


        //Fazendo a comparação de usuario e senha corretos e anunciando o horário de acesso, posteriormente.
        for (int i = 0; i < usuariosCadastrados.size(); i++) {

            if(usuarioLogin.equals(usuariosCadastrados.get(i))&& usuarioSenha.equals(senhasCadastradas.get(i))) {

                if (horaParaUtilizar >= 6 && horaParaUtilizar < 12) {
                    System.out.println("Bom dia, você se logou ao nosso sistema.");
                    break;
                } else if (horaParaUtilizar >= 12 && horaParaUtilizar < 18) {
                    System.out.println("Boa tarde, você se logou ao nosso sistema");
                    break;
                } else if (horaParaUtilizar >= 18 && horaParaUtilizar < 24) {
                    System.out.println("Boa noite, você se logou ao nosso sistema.");
                    break;
                } else if (horaParaUtilizar >= 0 && horaParaUtilizar < 6) {
                    System.out.println("Boa madrugada, você se logou ao nosso sistema.");
                    break;
                }
            }
            if(i == (usuariosCadastrados.size()-1)) {
            System.out.println("Usuário e/ou senha incorretos.");
            }

        }
    }

}