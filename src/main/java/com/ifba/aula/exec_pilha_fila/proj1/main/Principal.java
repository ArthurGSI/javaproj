package com.ifba.aula.exec_pilha_fila.proj1.main;

import com.ifba.aula.exec_pilha_fila.proj1.basica.Processo;
import com.ifba.aula.exec_pilha_fila.proj1.estrutura.Fila;

public class Principal {

    public static void main(String[] args) {

        Fila fila = new Fila(10);

        Processo p1 = new Processo(1, "Documento A");
        Processo p2 = new Processo(2, "Documento B");
        Processo p3 = new Processo(3, "Documento C");
        Processo p4 = new Processo(4, "Documento D");

        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);
        fila.adicionar(p4);

        fila.mostrar();

        System.out.println();

        System.out.println("Primeiro da fila:");
        System.out.println(fila.verificar());

        System.out.println();

        System.out.println("Processo removido:");
        System.out.println(fila.remover());

        System.out.println();

        fila.mostrar();

        System.out.println();

        System.out.println("Fila invertida:");
        fila.inverter();

        fila.mostrar();
    }
}