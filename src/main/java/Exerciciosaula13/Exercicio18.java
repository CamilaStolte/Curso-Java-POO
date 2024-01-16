package Exerciciosaula13;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println(" Digite a velocidade da internet: ");
		double tamInternet = scan.nextDouble();
		
		double tempo = tamArquivo / tamInternet;
		
		System.out.println("Tempo de download: " + tempo);
		
		
	}

}
