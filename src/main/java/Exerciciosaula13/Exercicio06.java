package Exerciciosaula13;

import java.util.Locale
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("Área do círculo: " + areaCirculo);

    }
}
