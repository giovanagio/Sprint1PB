package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaracao da lista de funcionarios para o programa
	    Scanner sc = new Scanner(System.in);
        List<FuncionariosEmpresa> funcionarios = new ArrayList<>();

        System.out.println("Digite a quantidade de funcionários para avaliar:");
        int numFuncionarios = sc.nextInt();

        //Cadastrando os funcionários, de acordo com o número da quantidade informado
        for (int i = 0; i < numFuncionarios; i++) {

            FuncionariosEmpresa funcionariosEmpresa = new FuncionariosEmpresa();
            System.out.println("Por favor, digite o nome do funcionário");
            funcionariosEmpresa.setName(sc.next());
            System.out.println("Digite o salário respectivo do funcionário");
            funcionariosEmpresa.setSalario(sc.nextDouble());

            funcionarios.add(funcionariosEmpresa);

        }
        //Realizando comparação final e demostrando os resultados
        //dos funcionários, salários e seus respectivos descontos/bonus
        for (int i = 0; i < funcionarios.size(); i++) {

            System.out.println("Funcionário: " + funcionarios.get(i).getName());
            System.out.println("Salário: " + funcionarios.get(i).getSalario());
            if(funcionarios.get(i).getSalario() > 2000){
                System.out.println("Desconto: " + funcionarios.get(i).getDesconto());
            }
            else {
                System.out.println("Bonificação: " + funcionarios.get(i).getBonificacao());
            }
            System.out.println("Salário Líquido: " + funcionarios.get(i).getSalarioLiquido());
            System.out.println("");
        }

    }
}
