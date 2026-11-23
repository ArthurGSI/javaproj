package com.ifba.aula.ativ_recur_bin_dec;

public class BinParaDec {

    public static int converter(int binario) {
        if (binario == 0) {
            return 0;
        }

        return (binario % 10) + 2 * converter(binario / 10);
    }
}