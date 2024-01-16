package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        System.out.print("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();
        double areaQuadrado = lado * lado;
        
        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("O dobro da área do quadrado é: " + (areaQuadrado * 2));

	}

}
