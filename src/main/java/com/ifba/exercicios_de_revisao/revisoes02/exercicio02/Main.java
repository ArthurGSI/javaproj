package com.ifba.exercicios_de_revisao.revisoes02.exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("\nDigite os 10 Números:\n");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int resultado = Somador.somar(numeros);

        System.out.println("O Total de Todos os Números: " + resultado);

        scanner.close();
    }
}
