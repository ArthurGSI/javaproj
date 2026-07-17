package com.ifba.aula.aula_matriz;

import java.util.Scanner;

public class CriarMatriz {

    
    private int matriz[][] = new int [3][2];

    public void criarMatriz(){
    
        Scanner sc = new Scanner(System.in);

        for(int li = 0; li < matriz.length; li++){
        
            for(int col = 0; col < matriz[0].length; col++){
                matriz[li][col] = sc.nextInt();
            }
        }
        sc.close();
    }
    public void imprimirMatriz() {
        for(int li = 0; li < matriz.length; li++){
            System.out.println();
            for(int col = 0; col < matriz[0].length; col++){
                System.out.print("|" + matriz[li][col] + "|");
            }
        }
    }


    
}
