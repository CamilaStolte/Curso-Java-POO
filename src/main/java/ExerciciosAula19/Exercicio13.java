package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio13 {	
		public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	
	    int[] vetorA = new int[10];        for (int i = 0; i < vetorA.length; i++) {
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
	
	    int multi5 = 0;
	    
	    for (int i = 0; i < vetorA.length; i++) {
	        if (vetorA[i] % 5 == 0) {
	        	multi5++;
	        }
	    }
	
	    System.out.println("Vetor A = ");
	    for (int i = 0; i < vetorA.length; i++) {
	        System.out.print(vetorA[i] + " ");
	    }
	    System.out.println();
	
	    System.out.println("Quantidade de elementos múltiplos por 5: " + multi5);
	
	}
}
