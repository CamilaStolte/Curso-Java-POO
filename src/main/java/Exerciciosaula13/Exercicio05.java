package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        System.out.println("Digite o valor em metros para ser convertido: ");
        double metros = scan.nextDouble();
        
        System.out.println("O valor convertido de metros para centimetros é: " + metros * 100 + "cm");
	}

}
