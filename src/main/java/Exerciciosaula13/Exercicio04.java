package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); // Configura o Scanner para usar o ponto como separador decimal

        try {
            System.out.println("Digite a sua primeira nota: ");
            double primeiraNota = scan.nextDouble();

            System.out.println("Digite a sua segunda nota: ");
            double segundaNota = scan.nextDouble();

            System.out.println("Digite a sua terceira nota: ");
            double terceiraNota = scan.nextDouble();

            System.out.println("Digite a sua quarta nota: ");
            double quartaNota = scan.nextDouble();

            double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

            System.out.println("A sua média de notas é: " + media);
        } catch (Exception e) {
            System.out.println("Erro de entrada. Digite um número válido.");
        } finally {
           
        }
    }
}
