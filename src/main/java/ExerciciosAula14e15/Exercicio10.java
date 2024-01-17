package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);

	       System.out.println("Digite em qual turno você estuda:");
	       System.out.println("(M) Matutino");
	       System.out.println("(V) Vespertino");
	       System.out.println("(N) Noturno");
	       String turno = scan.next().toLowerCase();
	       
	       switch (turno) {
	       
	       case "m" :
	    	   System.out.println("Bom dia");
	    	   break;
	       case "v" :
	    	   System.out.println("Boa tarde");
	    	   break;
	       case "n" :
	    	   System.out.println("Boa noite");
	    	   break;  
	       default:
               System.out.println("Opção inválida. Por favor, digite M, V ou N.");
             
	       }

	}

}
