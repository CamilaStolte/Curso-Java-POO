package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digiteo o número da base");
        int base = scan.nextInt();	
        
        System.out.println("Digite o número da potência");
        int pot = scan.nextInt();
        
        
        int resultado = base;
        
        for (int i = 1; i<pot; i++) {
        	resultado *= base;
        	
        }
        
        System.out.println("Resultado:" + resultado);
	}

}
