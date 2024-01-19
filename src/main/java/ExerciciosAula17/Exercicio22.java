package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        boolean ehPrimo = true;

        System.out.print("O número é divisível por: ");
        // Loop para verificar divisores
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // Se for divisível por i, então i é um fator
                System.out.print(i + " ");
                ehPrimo = false;
            }
        }

        // Verifica se o número é maior que 1 e não é primo
        if (num > 1 && !ehPrimo) {
            System.out.println("\nO número informado não é um número primo.");
        } else {
            System.out.println("\nO número informado é um número primo: " + num);
        }
    }
}
