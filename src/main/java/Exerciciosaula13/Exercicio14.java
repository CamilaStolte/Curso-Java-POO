package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        System.out.println("Digite o peso de peixes em kg: ");
        double pesoPeixes = scan.nextDouble();
        
        double excessoPeso = pesoPeixes - 50;
        double multa = excessoPeso * 4;
        
       if (excessoPeso > 0) {
    	   System.out.println("Você excedeu o peso de peixes em kg: " + excessoPeso + "kg, A multa a ser paga é: " + multa);
       } else {
    	   System.out.println("O peso está dentro do regulamento, não há multa a ser paga");
       }
	}

}
