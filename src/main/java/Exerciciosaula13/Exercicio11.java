package Exerciciosaula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Digite o primeiro número inteiro");
	     int primeiroNum = scan.nextInt();
	     
	     System.out.println("Digite o segundo número inteiro");
	     int segundoNum = scan.nextInt();
	     
	     System.out.println("Digite o um número real");
	     double realNum = scan.nextDouble();
	     
	     int opcaoA = (primeiroNum * 2) / (segundoNum / 2);
	     double opcaoB = (primeiroNum * 3) + realNum;
	     double opcaoC = Math.pow(realNum, 3);
	     
	     
	     System.out.println("Opção A: " + opcaoA);
	     System.out.println("Opção B: " + opcaoB);
	     System.out.println("Opção C: " + opcaoC);
	}

}
