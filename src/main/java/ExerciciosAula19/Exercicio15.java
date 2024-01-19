package ExerciciosAula19;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio15 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        
        for (int i = 0; i < vetorA.length; i++) {
        boolean entradaValida = false;

        do {
            try {
                System.out.println("Entre com o valor da posição " + i + " do vetorA:");
                vetorA[i] = scan.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, entre com um valor inteiro.");
                scan.next(); // Limpar o buffer do scanner
            }
        } while (!entradaValida);
    }

        int par = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        double porcPar = (double) par / vetorA.length * 100;
        double porcImpar = 100 - porcPar;

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Porcentagem pares: " + porcPar);
        System.out.println("Porcentagem ímpares: " + porcImpar);

        scan.close();
    }
}
