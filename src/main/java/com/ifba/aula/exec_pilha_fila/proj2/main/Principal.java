package com.ifba.aula.exec_pilha_fila.proj2.main;

import com.ifba.aula.exec_pilha_fila.proj2.basica.Processo;
import com.ifba.aula.exec_pilha_fila.proj2.estrutura.Fila;

public class Principal {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.adicionar(new Processo(1, "Documento A"));
        fila.adicionar(new Processo(2, "Documento B"));
        fila.adicionar(new Processo(3, "Documento C"));
        fila.adicionar(new Processo(4, "Documento D"));

        fila.mostrar();

        System.out.println();

        System.out.println("Primeiro processo:");
        System.out.println(fila.verificar());

        System.out.println();

        System.out.println("Processo removido:");
        System.out.println(fila.remover());

        System.out.println();

        System.out.println("Fila atual:");
        fila.mostrar();

        System.out.println();

        System.out.println("Fila invertida:");
        fila.inverter();

        fila.mostrar();
    }
}