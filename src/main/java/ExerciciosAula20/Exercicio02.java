package ExerciciosAula20;

import java.util.Random;

public class Exercicio02 {
	 public static void main(String[] args) {

	        int[][] numerosAleatorios = new int[4][4];

	        Random numeroRandom = new Random();

	        for (int i = 0; i < numerosAleatorios.length; i++) {
	            for (int j = 0; j < numerosAleatorios[i].length; j++) {
	                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
	            }
	        }

	        for (int i = 0; i < numerosAleatorios.length; i++) {
	            for (int j = 0; j < numerosAleatorios[i].length; j++) {
	                System.out.print(numerosAleatorios[i][j] + " ");
	            }
	            System.out.println();
	        }

	        int maiorL5 = numerosAleatorios[0][3];
	        int menorL5 = numerosAleatorios[0][3];

	        for (int i = 0; i < numerosAleatorios.length; i++) {
	            if (numerosAleatorios[i][3] > maiorL5) {
	                maiorL5 = numerosAleatorios[i][3];
	            }
	            if (numerosAleatorios[i][3] < menorL5) {
	                menorL5 = numerosAleatorios[i][3];
	            }
	        }
	        System.out.println("O maior valor da linha 5 é: " + maiorL5);
	        System.out.println("O menor valor da linha 5 é: " + menorL5);

	        // Encontrar maior e menor da coluna 7
	        int maiorC7 = numerosAleatorios[0][2];
	        int menorC7 = numerosAleatorios[0][2];

	        for (int i = 0; i < numerosAleatorios.length; i++) {
	            if (numerosAleatorios[i][2] > maiorC7) {
	                maiorC7 = numerosAleatorios[i][2];
	            }
	            if (numerosAleatorios[i][2] < menorC7) {
	                menorC7 = numerosAleatorios[i][2];
	            }
	        }
	        System.out.println("O maior valor da coluna 7 é: " + maiorC7);
	        System.out.println("O menor valor da coluna 7 é: " + menorC7);
	    }
	}