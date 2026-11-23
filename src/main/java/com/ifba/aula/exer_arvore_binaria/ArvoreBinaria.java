package com.ifba.aula.exer_arvore_binaria;

public class ArvoreBinaria {

    static class No {
        int valor;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
            esquerda = null;
            direita = null;
        }
    }

    private No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {

        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }

        return no;
    }

    public int menorValor() {

        if (raiz == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }

        No atual = raiz;

        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }

        return atual.valor;
    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
    }

    private void emOrdemRecursivo(No no) {

        if (no != null) {
            emOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdemRecursivo(no.direita);
        }
    }
}