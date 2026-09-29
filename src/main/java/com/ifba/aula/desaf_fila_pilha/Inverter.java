package com.ifba.aula.desaf_fila_pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inverter {
    public static void main(String[] args) {

        Queue<Character> fila = new LinkedList<>();
        Stack<Character> pilha = new Stack<>();

        fila.add('A');
        fila.add('B');
        fila.add('C');
        fila.add('D');
        fila.add('E');

        System.out.println("Fila original: " + fila);

        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("Fila invertida: " + fila);
    }
    
}
