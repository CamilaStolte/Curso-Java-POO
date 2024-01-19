package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        double num1, num2, num3, num4, num5;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = scan.nextDouble();

        System.out.println("Digite o quarto número: ");
        num4 = scan.nextDouble();

        System.out.println("Digite o quinto número: ");
        num5 = scan.nextDouble();
        
        double soma = num1 + num2 + num3 + num4 + num5;
        double media = (num1 + num2 + num3 + num4 + num5) / 5;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

	}

}
