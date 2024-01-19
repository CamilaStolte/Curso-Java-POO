package ExerciciosAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(); // Usar configuração padrão da máquina

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        // Preenchendo o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i + " do vetorA:");
            vetorA[i] = scan.nextInt();
        }

        // Preenchendo o vetorB
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor da posição " + i + " do vetorB:");
            vetorB[i] = scan.nextInt();
        }

        // Preenchendo o vetorC
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        // Exibindo o vetorA
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(); // Nova linha para separar os vetores na saída

        // Exibindo o vetorB
        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println(); // Nova linha para separar os vetores na saída

        // Exibindo o vetorC
        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(df.format(vetorC[i]) + " ");
        }
    }
}
