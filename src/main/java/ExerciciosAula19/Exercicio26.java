package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição A: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite um número para a posição B: ");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
