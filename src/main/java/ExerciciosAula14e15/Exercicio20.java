package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digite a primeira nota:");
        int nota1 = scan.nextInt();

        
        System.out.println("Digite a segunda nota:");
        int nota2 = scan.nextInt();
        
        System.out.println("Digite a terceira nota:");
        int nota3 = scan.nextInt();
        
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media == 10) {
        	System.out.println("Sua media foi:" + media + ", você foi aprovado com distinção!");
        } else if (media <= 7) {
        	System.out.println("Sua media foi:" + media + ", você está reprovado!");
        	
        } else {
        	System.out.println("Sua media foi:" + media + ", você está aprovado!");
        }
	}

}
