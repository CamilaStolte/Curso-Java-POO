package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio12 {
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
	        int soma = 0;

	        // Calculando a soma dos valores
	        for (int i = 0; i < vetorA.length; i++) {
	            soma += vetorA[i];
	        }

	        // Exibindo o vetorA
	        System.out.println("Vetor A = ");
	        for (int i = 0; i < vetorA.length; i++) {
	            System.out.print(vetorA[i] + " ");
	        }
	        System.out.println();

	        // Exibindo a soma dos valores
	        System.out.println("Soma dos valores: " + soma);
	  }
}
