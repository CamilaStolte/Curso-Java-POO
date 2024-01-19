package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");

            while (!scan.hasNextDouble()) {
                System.out.print("Entrada inválida. Tente novamente: ");
                scan.next();
            }

            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Tente novamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
    }
}
