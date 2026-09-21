package com.ifba.aula.exec_pilha_fila.proj2.estrutura;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ifba.aula.exec_pilha_fila.proj2.basica.Processo;

public class Fila {

    private Queue<Processo> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    // Adicionar
    public void adicionar(Processo processo) {
        fila.offer(processo);
    }

    // Remover
    public Processo remover() {
        return fila.poll();
    }

    // Verificar o primeiro
    public Processo verificar() {
        return fila.peek();
    }

    // Mostrar elementos
    public void mostrar() {

        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("Elementos da fila:");

        for (Processo processo : fila) {
            System.out.println(processo);
        }
    }

    // Inverter usando uma pilha
    public void inverter() {

        Stack<Processo> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
    }
}