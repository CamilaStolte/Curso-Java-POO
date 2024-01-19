package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            boolean entradaValida = false;

            do {
                try {
                    System.out.println("Entre com o valor da posição " + i + " do vetorA:");
                    vetorA[i] = scan.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, entre com um valor inteiro.");
                    scan.next(); // Limpar o buffer do scanner
                }
            } while (!entradaValida);
        }

        System.out.println("Elementos maiores que 15:");
        boolean encontrouMaiorQue15 = false;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 15) {
                System.out.print(vetorA[i] + " ");
                encontrouMaiorQue15 = true;
            }
        }
        if (!encontrouMaiorQue15) {
            System.out.println("Nenhum vetor maior que 15");
        }

        System.out.println("\nElementos iguais a 15:");
        boolean encontrouIgualA15 = false;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                System.out.print(vetorA[i] + " ");
                encontrouIgualA15 = true;
            }
        }
        if (!encontrouIgualA15) {
            System.out.println("Nenhum vetor igual a 15");
        }

        System.out.println("\nElementos menores que 15:");
        boolean encontrouMenorQue15 = false;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                System.out.print(vetorA[i] + " ");
                encontrouMenorQue15 = true;
            }
        }
        if (!encontrouMenorQue15) {
            System.out.println("Nenhum vetor menor que 15");
        }
    }
}
