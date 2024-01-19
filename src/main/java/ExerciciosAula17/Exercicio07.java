package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio07 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        int num1, num2, num3, num4, num5;

	        System.out.println("Digite o primeiro número: ");
	        num1 = scan.nextInt();

	        System.out.println("Digite o segundo número: ");
	        num2 = scan.nextInt();

	        System.out.println("Digite o terceiro número: ");
	        num3 = scan.nextInt();

	        System.out.println("Digite o quarto número: ");
	        num4 = scan.nextInt();

	        System.out.println("Digite o quinto número: ");
	        num5 = scan.nextInt();

	        // Encontrar o maior número Essa sequência aninhada de Math.max compara os cinco números e encontra o maior entre eles.
	        int maiorNumero = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);

	        System.out.println("O maior número digitado é: " + maiorNumero);
	    }
	}

