package com.ifba.exercicios_de_revisao.revisoes01;

public class Exercicio03 {
    public static void main(String[] args) {
        
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int proximoFibonacci;

        System.out.println("\nSequência de Fibonacci:\n");
        for (;fibonacci1 <= 100;) {
            System.out.println(fibonacci1);
            proximoFibonacci = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = proximoFibonacci;
        }
    }
    
}
