package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite o valor do primeiro produto: ");
		double valor1 = scan.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		double valor2 = scan.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		double valor3 = scan.nextDouble();
		
		
		 if (valor1 <= valor2 && valor1 <= valor3) {
		    	System.out.println("O primeiro produto é mais barato, compre ele. ");		    	
		    } else if (valor2 <= valor1 && valor2 <= valor3) {
		    	System.out.println("O segundo produto é mais barato, compre ele. ");		    	

		    } else if (valor3 <= valor1 && valor3 <= valor2) {
		    	System.out.println("O terceiro produto é mais barato, compre ele. ");		    	

		    }
	}

}
