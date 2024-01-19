package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
        	System.out.println("Digite um número para a posição: ");
        	vetorA[i] = scan.nextInt();
        	
        	if (vetorA[i] % 2 == 0) {
        		break;
        	}
        } 
	}
}
