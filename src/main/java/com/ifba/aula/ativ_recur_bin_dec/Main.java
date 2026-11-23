package com.ifba.aula.ativ_recur_bin_dec;

public class Main {

    public static void main(String[] args) {

        int binario = 1011;

        int decimal = BinParaDec.converter(binario);

        System.out.println("Binário: " + binario);
        System.out.println("Decimal: " + decimal);
    }
}