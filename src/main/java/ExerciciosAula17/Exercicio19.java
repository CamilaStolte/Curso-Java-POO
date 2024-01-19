package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menor = 1001;
        int maior = 0;
        int soma = 0;

        System.out.println("Qual o tamanho do conjunto?");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("O conjunto deve ter um tamanho maior que zero.");
            return;
        }

        System.out.println("Digite os " + n + " numeros");

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            // Adiciona verificação para aceitar apenas números entre 0 e 1000
            if (num >= 0 && num <= 1000) {
                if (num >= maior) {
                    maior = num;
                }

                if (num <= menor) {
                    menor = num;
                }

                soma += num;
            } else {
                System.out.println("Número fora do intervalo permitido (0 a 1000). Por favor, insira novamente.");
                i--; // Decrementa o índice para repetir a leitura deste número.
            }
        }

        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior numero é: " + maior);
        System.out.println("A soma de todos os numeros é: " + soma);
    }
}
