package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número ");
		int num = scan.nextInt();
		
		if (num % 2 == 0 ) {
			System.out.println("O número informado é par");
		} else {
			System.out.println("O número informado é ímpar");

		}
	}

}
