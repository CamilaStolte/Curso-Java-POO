package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número:");
	        int n = scanner.nextInt();

	        System.out.println("Números primos de 1 a " + n + ":");
	        for (int i = 2; i <= n; i++) {
	            if (isPrimo(i)) {
	                System.out.println(i + " é primo.");
	            }
	        }
	    }

	    private static boolean isPrimo(int num) {
	        if (num < 2) {
	            return false;
	        }

	        System.out.print("Divisões para " + num + ": ");
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            System.out.print(num + " / " + i + " = " + (num / i) + ", ");
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        System.out.println(); 
	        return true;
	  }
	
}
		     