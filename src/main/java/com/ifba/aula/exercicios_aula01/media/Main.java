package com.ifba.aula.exercicios_aula01.media;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a primeira nota\n");
        double nota1 = scanner.nextDouble();
        System.out.println("\nDigite a segunda nota\n");
        double nota2 = scanner.nextDouble();
        System.out.println("\nDigite a terceira nota\n");
        double nota3 = scanner.nextDouble();
        System.out.println("\nA média é: " + CalcularMedia.calcularMedia(nota1, nota2, nota3) + "\n");

        scanner.close();

        
    }
    
}
