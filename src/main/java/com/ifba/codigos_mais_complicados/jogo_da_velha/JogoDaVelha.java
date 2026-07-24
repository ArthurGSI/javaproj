package com.ifba.codigos_mais_complicados.jogo_da_velha;

import java.util.Scanner;

public class JogoDaVelha {

    private char[][] tabuleiro = new char[3][3];
    private char jogadorAtual = 'X';
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {

        inicializarTabuleiro();

        boolean fimDeJogo = false;

        while (!fimDeJogo) {

            mostrarTabuleiro();
            fazerJogada();

            if (verificarVitoria()) {
                mostrarTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                fimDeJogo = true;

            } else if (verificarEmpate()) {
                mostrarTabuleiro();
                System.out.println("Empate!");
                fimDeJogo = true;

            } else {
                trocarJogador();
            }
        }

        sc.close();
    }

    private void inicializarTabuleiro() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tabuleiro[i][j] = ' ';
            }
        }
    }

    private void mostrarTabuleiro() {

        System.out.println();

        System.out.println("  0   1   2");

        for (int i = 0; i < 3; i++) {

            System.out.print(i + " ");

            for (int j = 0; j < 3; j++) {

                System.out.print(tabuleiro[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println(" -----------");
            }
        }

        System.out.println();
    }

    private void fazerJogada() {

        int linha;
        int coluna;

        while (true) {

            System.out.println("Jogador " + jogadorAtual);

            System.out.print("Linha: ");
            linha = sc.nextInt();

            System.out.print("Coluna: ");
            coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {

                System.out.println("Posição inválida!");
                continue;
            }

            if (tabuleiro[linha][coluna] != ' ') {

                System.out.println("Essa posição já está ocupada!");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            break;
        }
    }

    private boolean verificarVitoria() {

        // Linhas
        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == jogadorAtual &&
                tabuleiro[i][1] == jogadorAtual &&
                tabuleiro[i][2] == jogadorAtual) {

                return true;
            }
        }

        // Colunas
        for (int i = 0; i < 3; i++) {

            if (tabuleiro[0][i] == jogadorAtual &&
                tabuleiro[1][i] == jogadorAtual &&
                tabuleiro[2][i] == jogadorAtual) {

                return true;
            }
        }

        // Diagonal principal
        if (tabuleiro[0][0] == jogadorAtual &&
            tabuleiro[1][1] == jogadorAtual &&
            tabuleiro[2][2] == jogadorAtual) {

            return true;
        }

        // Diagonal secundária
        if (tabuleiro[0][2] == jogadorAtual &&
            tabuleiro[1][1] == jogadorAtual &&
            tabuleiro[2][0] == jogadorAtual) {

            return true;
        }

        return false;
    }

    private boolean verificarEmpate() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    private void trocarJogador() {

        if (jogadorAtual == 'X') {
            jogadorAtual = 'O';
        } else {
            jogadorAtual = 'X';
        }
    }
}
