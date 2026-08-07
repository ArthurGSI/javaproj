package com.ifba.aula.lista_encadeada;

public class Celula {

    private int elemento;
    private Celula proxima;


    public Celula() {
    }


    public Celula(int elemento) {
        this.elemento = elemento;
        //this.proxima = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}