package com.ifba.aula.exer_arvore_binaria;

public class Main {

    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Árvore em ordem:");
        arvore.emOrdem();

        System.out.println("\nMenor valor: " + arvore.menorValor());
    }
}