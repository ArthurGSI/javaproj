package com.ifba.aula.recursao.potencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = entrada.nextInt();

        System.out.print("Digite a potência: ");
        int potencia = entrada.nextInt();

        int resultado = CalPotencia.calcular(base, potencia);

        System.out.println(base + "^" + potencia + " = " + resultado);

        entrada.close();
    }
    
}
