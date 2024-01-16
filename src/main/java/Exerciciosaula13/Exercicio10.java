package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite a temperatura em graus Celsius:");
        double temperaturaEmCelsius = scan.nextDouble();

        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.printf("A temperatura em Celsius é equivalente a: " + temperaturaEmFahrenheit + " Fahrenheit");

    }
}
