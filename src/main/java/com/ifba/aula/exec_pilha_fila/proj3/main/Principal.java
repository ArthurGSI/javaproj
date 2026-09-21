package com.ifba.aula.exec_pilha_fila.proj3.main;

import com.ifba.aula.exec_pilha_fila.proj3.basica.Processo;
import com.ifba.aula.exec_pilha_fila.proj3.estrutura.Pilha;

public class Principal {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        Processo p1 = new Processo(1, "Documento A");
        Processo p2 = new Processo(2, "Documento B");
        Processo p3 = new Processo(3, "Documento C");
        Processo p4 = new Processo(4, "Documento D");

        pilha.empilhar(p1);
        pilha.empilhar(p2);
        pilha.empilhar(p3);
        pilha.empilhar(p4);

        pilha.imprimir();

        System.out.println();

        System.out.println("Topo da pilha:");
        System.out.println(pilha.verificarTopo());

        System.out.println();

        System.out.println("Processo desempilhado:");
        System.out.println(pilha.desempilhar());

        System.out.println();

        System.out.println("Pilha atual:");
        pilha.imprimir();
    }
}