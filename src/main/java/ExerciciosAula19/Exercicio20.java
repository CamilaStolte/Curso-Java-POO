package ExerciciosAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato para duas casas decimais

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Digite a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        System.out.println("Cotação");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorA[i]) + " ");
        }
        System.out.println();
    }
}
