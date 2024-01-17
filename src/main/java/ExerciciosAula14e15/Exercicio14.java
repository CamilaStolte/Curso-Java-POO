package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

    System.out.println("Digite a sua primeira nota: ");
    double primeiraNota = scan.nextDouble();

    System.out.println("Digite a sua segunda nota: ");
    double segundaNota = scan.nextDouble();

    double media = (primeiraNota + segundaNota) / 2;
    
    String aproveitamento = "";
    
    if (media >= 9 && media <= 10) {
    	aproveitamento = "A";
    	
    } else if (media >= 7.5 && media <= 9) {
    	aproveitamento = "B";
    	
    } else if (media >= 6 && media <= 7.5) {
    	aproveitamento = "c";
    	
    } else if (media >= 4 && media <= 6) {
    	aproveitamento = "D";
    	
    } else if (media >= 0 && media <= 4) {
    	aproveitamento = "E";
    }
    System.out.println("Nota 1: " + primeiraNota);
    System.out.println("Nota 2: " + segundaNota);
    System.out.println("Média: " + media);
    System.out.println("Conceito " + aproveitamento);
    
    switch (aproveitamento) {
    case "A":
    case "B":
    case "C":
    	System.out.println("APROVADO");
    	break;
    case "D":
    case "E":
    	System.out.println("REPROVADO");
    	break;

    }

    


	}

}
