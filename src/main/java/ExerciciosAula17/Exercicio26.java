package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    System.out.println("Informe a quantidade de eleitores:");
    int quantidadeEleitores = scan.nextInt();

    int[] votos = new int[3]; // Array para armazenar os votos de cada candidato

    for (int i = 1; i <= quantidadeEleitores; i++) {
        System.out.println("Eleitor " + i + ": Escolha um candidato (1, 2 ou 3):");
        int voto = scan.nextInt();

        // Verifica se o voto é válido (1, 2 ou 3)
        if (voto >= 1 && voto <= 3) {
            votos[voto - 1]++; // Incrementa o contador de votos para o candidato correspondente
        } else {
            System.out.println("Voto inválido. Por favor, escolha um candidato válido.");
            i--; // Decrementa o índice para repetir a votação deste eleitor.
        }
    }

    System.out.println("\nResultado da votação:");
    for (int i = 0; i < votos.length; i++) {
        System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
    }
}
}