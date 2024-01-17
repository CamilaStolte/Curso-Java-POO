package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite a operação desejada: + - / * : ");
		String operacao =scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+":
			System.out.println("A soma dos números é: " + (num1 + num2));
			break;
		case "-":
			System.out.println("A subtração dos números é: " + (num1 - num2));
			break;
		case "/":
			System.out.println("A divisão dos números é: " + (num1 / num2));
			break;
		case "*":
			System.out.println("A multiplicação dos números é: " + (num1 * num2));
			break;
			default :
				System.out.println(" Operação inválida");
				valida = false;
		}
		
		if (valida) {
			if (resultado >= 0) {
				System.out.println(" O resultado é positivo");
			} else {
				System.out.println(" O resultado é negativo");
			}
		}
			
		if (resultado % 2 == 0) {
			System.out.println(" O resultado é par");
		} else {
			System.out.println(" O resultado é impar");
		}
	}
	
}