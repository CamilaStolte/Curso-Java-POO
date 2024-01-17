package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Digite o  primeiro número: ");
	    int primeiroNum = scanner.nextInt();
	  
	    System.out.println("Digite o  segundo número: ");
	    int segundoNum = scanner.nextInt();
	    
	    System.out.println("Digite o  terceiro número: ");
	    int terceiroNum = scanner.nextInt();
	    
	    if (primeiroNum > segundoNum && primeiroNum > terceiroNum) {
	    	System.out.println("O primeiro número é maior: " + primeiroNum);
	    	
	    } else if (segundoNum > primeiroNum && segundoNum > terceiroNum) {
	    	System.out.println("O segundo número é maior: " + segundoNum);

	    } else if (terceiroNum > primeiroNum && terceiroNum > segundoNum) {
	    	System.out.println("O terceiro número é maior: " + terceiroNum);

	    }
	    
	    if (primeiroNum < segundoNum && primeiroNum < terceiroNum) {
	    	System.out.println("O primeiro número é menor: " + primeiroNum);
	    	
	    } else if (segundoNum < primeiroNum && segundoNum < terceiroNum) {
	    	System.out.println("O segundo número é menor: " + segundoNum);

	    } else if (terceiroNum < primeiroNum && terceiroNum < segundoNum) {
	    	System.out.println("O terceiro número é menor: " + terceiroNum);

	    }

	}

}
