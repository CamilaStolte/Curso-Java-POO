package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio17 {
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

        System.out.println("Pesosas com idade superior a 35 anos:");
        boolean maior35 = false;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                System.out.print(vetorA[i] + " ");
                maior35 = true;
            }
        }
	}
}