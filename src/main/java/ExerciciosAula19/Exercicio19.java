package ExerciciosAula19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio19 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        double[] nota1 = new double[10];
	        double[] nota2 = new double[nota1.length];
	        double[] result = new double[nota1.length];

	        for (int i = 0; i < nota1.length; i++) {
	            boolean entradaValida = false;

	            do {
	                try {
	                    System.out.println("Digite o valor da posição " + i + " da primeira nota:");
	                    nota1[i] = scan.nextDouble();

	                    System.out.println("Digite o valor da posição " + i + " da segunda nota:");
	                    nota2[i] = scan.nextDouble();

	                    entradaValida = true;
	                } catch (InputMismatchException e) {
	                    System.out.println("Por favor, digite um valor válido");
	                    scan.next(); // Limpar o buffer do scanner
	                }
	            } while (!entradaValida);

	            // Calcular a média e armazenar em 'result'
	            result[i] = (nota1[i] + nota2[i]) / 2;
	        }

	        System.out.println("Notas 1:");
	        for (int i = 0; i < nota1.length; i++) {
	            System.out.print(nota1[i] + " ");
	        }
	        System.out.println();

	        System.out.println("Notas 2:");
	        for (int i = 0; i < nota2.length; i++) {
	            System.out.print(nota2[i] + " ");
	        }
	        System.out.println();

	        System.out.println("Resultados:");
	        for (int i = 0; i < result.length; i++) {
	            if (result[i] >= 7) {
	                System.out.println(result[i] + " - Aprovado");
	            } else {
	                System.out.println(result[i] + " - Reprovado");
	            }
	        }
	    }
	}


