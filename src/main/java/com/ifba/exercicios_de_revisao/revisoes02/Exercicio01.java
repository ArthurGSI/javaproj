package com.ifba.exercicios_de_revisao.revisoes02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
