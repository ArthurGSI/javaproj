package com.ifba.exercicio_banco;

public class CadastrarConta {
    
    private Conta[] contas;
    private int totalContas;

    public CadastrarConta() {
        this.contas = new Conta[100];
        this.totalContas = 0;
    }

    public void adicionarConta(Conta novaConta) {
        if (totalContas >= contas.length) {
            aumentarCapacidade();
        }
        contas[totalContas] = novaConta;
        totalContas++;
        System.out.println("Conta adicionada: " + novaConta.getNome());
    }

    public void listarConta() {
        if (totalContas == 0) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        for (int i = 0; i < totalContas; i++) {
            System.out.println("[" + i + "] " + contas[i]);
        }
    }

    public void procurarConta(String nome) {
        boolean encontrada = false;
        for (int i = 0; i < totalContas; i++) {
            if (contas[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("Conta encontrada: " + contas[i]);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Conta com o titular '" + nome + "' não foi encontrada.");
        }
    }

    public void removerConta(int posicao) {
        if (posicao < 0 || posicao >= totalContas) {
            System.out.println("Posição inválida!");
            return;
        }
        System.out.println("Conta removida: " + contas[posicao].getNome());
        for (int i = posicao; i < totalContas - 1; i++) {
            contas[i] = contas[i + 1];
        }
        contas[totalContas - 1] = null;
        totalContas--;
    }

    private void aumentarCapacidade() {
        Conta[] novoArray = new Conta[contas.length + 1];
        
        System.arraycopy(contas, 0, novoArray, 0, contas.length);

        contas = novoArray;
        System.out.println("Capacidade do vetor aumentada para: " + contas.length);
    }
}