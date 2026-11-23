package com.ifba.aula.recursao.potencia;

public class CalPotencia {
  public static int calcular(int base, int potencia) {

        if (potencia == 0) {
            return 1;
        }

        return base * calcular(base, potencia - 1);
    }
    
}  

