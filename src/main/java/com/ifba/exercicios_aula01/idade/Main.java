package com.ifba.exercicios_aula01.idade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o ano de nascimento\n");
        int anoNascimento = scanner.nextInt();
        System.out.println("Digite o ano atual\n");
        int anoAtual = scanner.nextInt();
        System.out.println("\nSua idade é: " + CalcularIdade.calcularIdade(anoNascimento, anoAtual) + "\n");
        scanner.close();
    }
    
}
