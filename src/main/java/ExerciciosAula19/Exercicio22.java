package ExerciciosAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato para duas casas decimais

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random());

            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        double porc0 = (qtd0 * 100.0) / vetorA.length;
        double porc1 = (qtd1 * 100.0) / vetorA.length;

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem 0 = " + df.format(porc0) + "%");
        System.out.println("Porcentagem 1 = " + df.format(porc1) + "%");
    }
}
