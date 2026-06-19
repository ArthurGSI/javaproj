package com.ifba.exercicios_de_revisao.revisoes01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int resultado = 0;

        System.out.println("\nDigite o primeiro número\n");
        int num1 = scanner.nextInt();
        System.out.println("\nDigite o operador (+, -, *, /)\n");
        char operator = scanner.next().charAt(0);
        System.out.println("\nDigite o segundo número\n");
        int num2 = scanner.nextInt();

        scanner.close();

        switch (operator) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':      
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero");
                    return;
                }
                break;  

        
            default:
                System.out.println("Operador inválido");
                break;
        }
        
        System.out.println("\nO resultado é: " + resultado + "\n");
    }

    
    
}
