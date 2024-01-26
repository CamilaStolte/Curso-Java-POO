package ExerciciosAula25a27;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogadorA = new Jogador('X');
        Jogador jogadorB = new Jogador('O');
        int qtnJogadas = 1;

        tabuleiro.mostrarTabuleiro();

        boolean flagChecagemVitoria = true;

        do {
            Jogador jogadorAtual = (qtnJogadas % 2 == 0) ? jogadorB : jogadorA;

            System.out.println("Vez do jogador: " + jogadorAtual.getMarca());

            System.out.print("Informe a linha: ");
            int linha = sc.nextInt();

            System.out.print("Informe a coluna: ");
            int coluna = sc.nextInt();

            tabuleiro.realizarJogada(linha, coluna, jogadorAtual);
            tabuleiro.mostrarTabuleiro();

            if (tabuleiro.verificarVitoria(jogadorAtual)) {
                System.out.println("Parabéns, jogador " + jogadorAtual.getMarca() + " ganhou!");
                flagChecagemVitoria = false;
            } else if (tabuleiro.verificarEmpate()) {
                System.out.println("Ninguém ganhou essa partida. Empate!");
                flagChecagemVitoria = false;
            }

            qtnJogadas++;

        } while (flagChecagemVitoria);
    }
}
