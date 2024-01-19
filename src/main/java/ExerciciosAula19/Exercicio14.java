package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio14 {
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
	
	    int impar = 0;
	    int somaImpares = 0;
	    
	    for (int i = 0; i < vetorA.length; i++) {
	        if (vetorA[i] % 2 != 0) {
	        	impar+= vetorA[i];
	        	somaImpares++;
	        	
	        }
		
		    if (impar > 0) {
	            double mediaImpares = (double) somaImpares / impar;
	            System.out.println("Média dos valores ímpares: " + mediaImpares);
	        } else {
	            System.out.println("Não há valores ímpares para calcular a média.");
	        }
        }
	}
}
