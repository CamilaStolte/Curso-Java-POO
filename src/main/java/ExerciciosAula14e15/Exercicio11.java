package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);

	       System.out.println("Digite o valor do seu salário: ");
	       double salario = scan.nextDouble();
	       
	       double aumento20 = salario * 0.20;
	       double aumento15 = salario * 0.15;
	       double aumento10 = salario * 0.10;
	       double aumento5 = salario * 0.05;
	       
	       if (salario <= 280) {
	    	   System.out.println("O valor do salário é: " + salario);
	    	   System.out.println("Teve um aumento de 20%");
	    	   System.out.println("O valor do aumento foi: " + ( aumento20));
	    	   System.out.println("O novo salário com o aumento é: " + (salario + aumento20));
	      
	       } else if (salario > 280 && salario <= 700) {
	    	   System.out.println("O valor do salário é: " + salario);
	    	   System.out.println("Teve um aumento de 15%");
	    	   System.out.println("O valor do aumento foi: " + ( aumento15));
	    	   System.out.println("O novo salário com o aumento é: " + (salario + aumento15));
	      
	       } else if (salario > 700 && salario <= 1500) {
	    	   System.out.println("O valor do salário é: " + salario);
	    	   System.out.println("Teve um aumento de 10%");
	    	   System.out.println("O valor do aumento foi: " + ( aumento10));
	    	   System.out.println("O novo salário com o aumento é: " + (salario + aumento10));

	       } else if (salario >= 1501) {
	    	   System.out.println("O valor do salário é: " + salario);
	    	   System.out.println("Teve um aumento de 5%");
	    	   System.out.println("O valor do aumento foi: " + ( aumento5));
	    	   System.out.println("O novo salário com o aumento é: " + (salario + aumento5));

	     
	       } else  {
	    	   System.out.println("Insira um valor válido");
	       }
	       

	}

}
