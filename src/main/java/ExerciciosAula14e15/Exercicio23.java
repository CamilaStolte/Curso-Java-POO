package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");

        if (scan.hasNext()) {
            String input = scan.next();

            try {
                double numero = Double.parseDouble(input);

                if (numero == (int) numero) {
                    System.out.println("O número é inteiro.");
                } else {
                    System.out.println("O número é decimal.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }

	}
}
