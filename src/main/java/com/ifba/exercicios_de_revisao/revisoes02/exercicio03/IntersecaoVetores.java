package com.ifba.exercicios_de_revisao.revisoes02.exercicio03;

public class IntersecaoVetores {

    public static int[] intersecao(int[] vetor1, int[] vetor2) {

        int[] resultado = new int[vetor1.length + vetor2.length];

        System.arraycopy(vetor1, 0, resultado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, resultado, vetor1.length, vetor2.length);

        return resultado;





    }

    
}
