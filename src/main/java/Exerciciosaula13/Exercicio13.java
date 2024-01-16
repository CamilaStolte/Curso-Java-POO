package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
	    
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Digite se você é homem ou mulher ");
		String genero = scan.next();
		
		double mulher = (62.1 * altura) - 44.7;
		double homem = (72.7 * altura) - 58;
				
		 if (genero.equals("mulher")) {
	            System.out.println("O seu peso ideal é: " + mulher);
	        } else if (genero.equals("homem")) {
	            System.out.println("O seu peso ideal é: " + homem);
	        } else {
	            System.out.println("Gênero não reconhecido.");
	        }

	}

}
