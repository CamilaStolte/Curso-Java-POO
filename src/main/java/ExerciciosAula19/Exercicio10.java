package ExerciciosAula19;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(); // Usar configuração padrão da máquina

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // Preenchendo o vetorA
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

            // Copiando o valor de vetorA para vetorB
            vetorB[i] = vetorA[i] % 2;
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

    }
}
