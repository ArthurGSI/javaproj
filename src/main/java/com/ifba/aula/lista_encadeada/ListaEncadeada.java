package com.ifba.aula.lista_encadeada;

public class ListaEncadeada {

    private Celula cabeca;
    private Celula cauda;
    private int tamanho;

    public ListaEncadeada(Celula cabeca, Celula cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
        this.tamanho = 0;
    }

    public ListaEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public Celula getCabeca() {
        return cabeca;
    }

    public void setCabeca(Celula cabeca) {
        this.cabeca = cabeca;
    }

    public Celula getCauda() {
        return cauda;
    }

    public void setCauda(Celula cauda) {
        this.cauda = cauda;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inserir(int valor) {
        Celula novaCelula = new Celula(valor);

        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            cauda.setProxima(novaCelula);
            cauda = novaCelula;
        }

        tamanho++;
    }

    public void inserirNoComeco(int valor) {
        Celula novaCelula = new Celula(valor);

        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            novaCelula.setProxima(cabeca);
            cabeca = novaCelula;
        }

        tamanho++;
    }

    public void inserirPorPosicao(int valor, int posicao) {

        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            inserirNoComeco(valor);
            return;
        }

        if (posicao == tamanho) {
            inserir(valor);
            return;
        }

        Celula atual = cabeca;

        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProxima();
        }

        Celula novaCelula = new Celula(valor);
        novaCelula.setProxima(atual.getProxima());
        atual.setProxima(novaCelula);

        tamanho++;
    }

    public void removerCabeca() {

        if (cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (cabeca == cauda) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.getProxima();
        }

        tamanho--;
    }

    public void removerCauda() {

        if (cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (cabeca == cauda) {
            cabeca = null;
            cauda = null;
            tamanho--;
            return;
        }

        Celula atual = cabeca;

        while (atual.getProxima() != cauda) {
            atual = atual.getProxima();
        }

        atual.setProxima(null);
        cauda = atual;

        tamanho--;
    }

    public void removerPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida!");
            return;
        }
    
        if (posicao == 0) {
            removerCabeca();
            return;
        }
    
        if (posicao == tamanho - 1) {
            removerCauda();
            return;
        }
    
        Celula atual = cabeca;
    
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProxima();
        }
    
        Celula removida = atual.getProxima();
        atual.setProxima(removida.getProxima());
    
        tamanho--;
    }

    public void imprimirLista() {

        Celula atual = cabeca;

        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProxima();
        }

        System.out.println();
    }
}