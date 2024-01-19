package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o n-ésimo termo da série de fibonacci:");
        int n =scan.nextInt();
        
        int primeiro = 1;
        int segundo = 2;
        int proximo;
        
        System.out.println(primeiro);
        System.out.println(segundo);

        
        for (int i =3; i<=n; i++) {
        	
        	proximo = primeiro +segundo;
        	primeiro = segundo;
        	segundo = proximo;
        	
        
            System.out.println(proximo);

        }

		

	}

}
