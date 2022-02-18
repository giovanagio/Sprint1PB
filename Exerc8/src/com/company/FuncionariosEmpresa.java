package com.company;

public class FuncionariosEmpresa {
    private String name;
    private double salario;
    private double bonificacao;
    private double salarioLiquido;
    private double desconto = 0;

    public void calculaBonusFuncionario(double salario){

        if (salario <= 1000) {
            this.bonificacao = salario * 0.2;
        }
        else if(salario <= 2000){
            this.bonificacao = salario * 0.1;
        }
        else if(salario > 2000){
            this.desconto = salario * 0.1;
        }
        this.salarioLiquido = (salario - desconto) + bonificacao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public double getDesconto(){
        return desconto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        calculaBonusFuncionario(salario);
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public double getSalarioLiquido(){
        return salarioLiquido;
    }


}
