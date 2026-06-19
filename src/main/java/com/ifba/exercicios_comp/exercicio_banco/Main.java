package com.ifba.exercicios_comp.exercicio_banco;

public class Main {
    public static void main(String[] args) {
        
        CadastrarConta banco = new CadastrarConta();

        Conta c1 = new Conta("Jonas", 100.0);
        Conta c2 = new Conta("Fernando", 200.0);
        Conta c3 = new Conta("Roberto", 300.0);
        Conta c4 = new Conta("Leandro", 400.0);

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);
        banco.adicionarConta(c4);

        banco.imprimirVetor();
        
    }
}