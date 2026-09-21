package com.ifba.aula.exec_pilha_fila.proj3.estrutura;

import com.ifba.aula.exec_pilha_fila.proj3.basica.Processo;

public class Pilha {

    private Processo[] pilha;
    private int topo;

    public Pilha(int capacidade) {
        pilha = new Processo[capacidade];
        topo = -1;
    }

    // Empilhar
    public void empilhar(Processo processo) {

        if (topo == pilha.length - 1) {
            System.out.println("Pilha cheia.");
            return;
        }

        topo++;
        pilha[topo] = processo;
    }

    // Desempilhar
    public Processo desempilhar() {

        if (topo == -1) {
            return null;
        }

        Processo processo = pilha[topo];

        pilha[topo] = null;
        topo--;

        return processo;
    }

    // Verificar o topo
    public Processo verificarTopo() {

        if (topo == -1) {
            return null;
        }

        return pilha[topo];
    }

    // Imprimir elementos
    public void imprimir() {

        if (topo == -1) {
            System.out.println("Pilha vazia.");
            return;
        }

        System.out.println("Elementos da pilha:");

        for (int i = topo; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
}