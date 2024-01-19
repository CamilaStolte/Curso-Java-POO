package ExerciciosAula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {
	
		public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in).useLocale(Locale.US);		
		
		System.out.println("Digite o valor do pão: ");
		double valorPao = scan.nextDouble();
		
		System.out.println("Preço do pão: " + valorPao);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
	
	
	    double precoBase = valorPao;
	    double incremento = valorPao;
	
	
	    for (int produto = 1; produto <= 50; produto++) {
	        double preco = precoBase + (incremento * (produto - 1));
	        System.out.println(produto + " - R$ " + preco);
	    }
	}
}