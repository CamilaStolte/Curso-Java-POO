package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para vítima? ");
		String resp1 = scan.nextLine();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = scan.nextLine();
		
		System.out.println("Mora perto da vítima? ");
		String resp3 = scan.nextLine();
		
		System.out.println("Já trabalhou com a vítima? ");
		String resp4 = scan.nextLine();
		
		System.out.println("Devia dinheiro para vítima? ");
		String resp5 = scan.nextLine();
		
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont ++;
		}
		
		if (resp2.equalsIgnoreCase("S")) {
			cont ++;
		}
		if (resp3.equalsIgnoreCase("S")) {
				cont ++;
		}
		if (resp4.equalsIgnoreCase("S")) {
					cont ++;
		}
		if (resp5.equalsIgnoreCase("S")) {
			cont ++;
		}
			
		if (cont == 2) {
			System.out.println("Suspeito");
		} else if (cont == 3) {
			System.out.println("Cúmplice");
		} else if (cont == 5) {
			System.out.println("Assassino");
		} else if (cont == 0) {
			System.out.println("Inocente");
			
		}
		
		
	}

}
