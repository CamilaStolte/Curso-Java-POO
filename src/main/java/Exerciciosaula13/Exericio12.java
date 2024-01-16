package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exericio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
	    
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoideal = (72 * altura) - 58;
		
		System.out.println("De acordo com sua altura, seu peso ideal é: " + pesoideal);
				

	}

}
