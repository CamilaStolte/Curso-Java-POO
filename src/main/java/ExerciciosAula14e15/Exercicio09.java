package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio09 {
	  public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o primeiro número: ");
	        double numero1 = scanner.nextDouble();

	        System.out.println("Digite o segundo número: ");
	        double numero2 = scanner.nextDouble();

	        System.out.println("Digite o terceiro número: ");
	        double numero3 = scanner.nextDouble();

	        ordenarNumeros(numero1, numero2, numero3);

	        scanner.close();
	    }

	    public static void ordenarNumeros(double a, double b, double c) {
	        System.out.println("Números em ordem crescente: ");
	        if (a <= b && b <= c) {
	            System.out.println(a + " " + b + " " + c);
	        } else if (a <= c && c <= b) {
	            System.out.println(a + " " + c + " " + b);
	        } else if (b <= a && a <= c) {
	            System.out.println(b + " " + a + " " + c);
	        } else if (b <= c && c <= a) {
	            System.out.println(b + " " + c + " " + a);
	        } else if (c <= a && a <= b) {
	            System.out.println(c + " " + a + " " + b);
	        } else { // c <= b && b <= a
	            System.out.println(c + " " + b + " " + a);
	        }

	        System.out.println("Números em ordem decrescente: ");
	        if (a >= b && b >= c) {
	            System.out.println(a + " " + b + " " + c);
	        } else if (a >= c && c >= b) {
	            System.out.println(a + " " + c + " " + b);
	        } else if (b >= a && a >= c) {
	            System.out.println(b + " " + a + " " + c);
	        } else if (b >= c && c >= a) {
	            System.out.println(b + " " + c + " " + a);
	        } else if (c >= a && a >= b) {
	            System.out.println(c + " " + a + " " + b);
	        } else { // c >= b && b >= a
	            System.out.println(c + " " + b + " " + a);
	        }
	    }
	}

