package com.ifba.exercicios_de_revisao.revisoes02.exercicio02;

public class Somador {

    public static int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
