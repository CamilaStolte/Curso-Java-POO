package Exerciciosaula13;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em graus Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.printf("A temperatura em Fahrenheit é equivalente a " + celsius + " Celsius");

    }
}
