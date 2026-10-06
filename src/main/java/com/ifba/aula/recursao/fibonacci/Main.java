package com.ifba.aula.recursao.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a posição da sequência: ");
        int n = entrada.nextInt();

        int resultado = CalFibonacci.calcular(n);

        System.out.println("Fibonacci de " + n + " = " + resultado);

        entrada.close();
    }
    
}
