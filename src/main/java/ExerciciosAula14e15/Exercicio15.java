package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    System.out.println("Digite o primeiro lado: ");
	    int lado1 = scan.nextInt();

	    System.out.println("Digite o segundo lado:: ");
	    int lado2 = scan.nextInt();
	    
	    System.out.println("Digite o terceiro lado:: ");
	    int lado3 = scan.nextInt();
	    
	    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

	}

}

