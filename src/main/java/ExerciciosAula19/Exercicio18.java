package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio18 {
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
        int menorIdade = vetorA[0];  // Inicializa com o primeiro valor
        int maiorIdade = vetorA[0];
        
        for (int i = 1; i < vetorA.length; i++) {
            if (vetorA[i] < menorIdade) {
                menorIdade = vetorA[i];
            }

            if (vetorA[i] > maiorIdade) {
                maiorIdade = vetorA[i];
            }
        }

        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Maior idade: " + maiorIdade);
        
	}
}

