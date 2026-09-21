package com.ifba.aula.exec_pilha_fila.proj1.estrutura;

import java.util.Stack;

import com.ifba.aula.exec_pilha_fila.proj1.basica.Processo;

public class Fila {

    private Processo[] fila;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        fila = new Processo[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    // Adicionar
    public void adicionar(Processo processo) {

        if (tamanho == fila.length) {
            System.out.println("Fila cheia.");
            return;
        }

        fila[fim] = processo;
        fim = (fim + 1) % fila.length;
        tamanho++;
    }

    // Remover
    public Processo remover() {

        if (tamanho == 0) {
            return null;
        }

        Processo processo = fila[inicio];

        fila[inicio] = null;
        inicio = (inicio + 1) % fila.length;
        tamanho--;

        return processo;
    }

    // Verificar o primeiro elemento
    public Processo verificar() {

        if (tamanho == 0) {
            return null;
        }

        return fila[inicio];
    }

    // Mostrar todos os elementos
    public void mostrar() {

        if (tamanho == 0) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("Elementos da fila:");

        for (int i = 0; i < tamanho; i++) {

            int posicao = (inicio + i) % fila.length;

            System.out.println(fila[posicao]);
        }
    }

    // Inverter a fila utilizando uma pilha
    public void inverter() {

        Stack<Processo> pilha = new Stack<>();

        // Retira da fila e coloca na pilha
        while (tamanho > 0) {
            pilha.push(remover());
        }

        // Retira da pilha e coloca novamente na fila
        while (!pilha.isEmpty()) {
            adicionar(pilha.pop());
        }
    }
}