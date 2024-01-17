package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Digite o valor de A : ");
		    int a = scan.nextInt();
		    
		    if (a ==0) {
		    	System.out.println("Não é equação de segundo grau");
		    } else  {
			    System.out.println("Digite o valor de B:: ");
			    int b = scan.nextInt();
			    
			    System.out.println("Digite o valor de C: ");
			    int c = scan.nextInt();
			    
			    double delta =(b*b) - (4*a*c);
			    
			    if (delta < 0) {
			    	System.out.println("delta negativo");
			    	
			    } else {
			    	double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
			    	double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
			    	
			    	System.out.println(" x1 = " +x1);
			    	System.out.println(" x2 = " +x2);


			    }
		    }
	}

}
