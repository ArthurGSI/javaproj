package com.ifba.exercicios_comp.exercicio_banco;

public class Conta {

    private String nome;
    private double valor;
    
    public Conta(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "\nTitular: " + nome + "\nSaldo: R$ " + valor;
    }
}
