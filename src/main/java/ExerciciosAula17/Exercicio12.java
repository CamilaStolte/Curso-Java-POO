package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada");
        int num = scan.nextInt();
        
        System.out.println("Tabuada de " + num + ":");
        
        for (int i= 1; i <= 10; i++) {
        	System.out.println(num + "x" + i + "=" + (num*i));
        }
	}

}
