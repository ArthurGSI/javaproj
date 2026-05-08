package com.ifba.exercicios_de_revisao01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o Número que deseja receber a tabuada\n");
        int numero = scanner.nextInt();
        System.out.println("\nTabuada do " + numero + ":\n");
        int i = 1;
        while (i <= 10){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
            scanner.close();
    }

    
}
