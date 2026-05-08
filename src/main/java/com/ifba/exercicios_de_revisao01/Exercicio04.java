package com.ifba.exercicios_de_revisao01;

public class Exercicio04 {
    public static void main(String[] args) {
        
        int sImpar = 0;
        long mPar = 1;
        
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                mPar *= i;
                System.out.println("\nNúmero par: " + i);
                System.out.println("Produto dos números pares: " + mPar + "\n");
            } else {
                sImpar += i;
                System.out.println("\nNúmero ímpar: " + i);
                System.out.println("Soma dos números ímpares: " + sImpar + "\n");
            }
        }

    }
    
}
