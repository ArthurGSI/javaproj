package com.ifba.aula.desaf_fila_pilha;

import java.util.Scanner;
import java.util.Stack;

public class VerifPalindromo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String invertida = "";

        while (!pilha.isEmpty()) {
            invertida += pilha.pop();
        }

        if (palavra.equalsIgnoreCase(invertida)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        entrada.close();
    }
    
}
