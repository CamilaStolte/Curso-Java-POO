package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros vendidos: ");
        double litros = scan.nextDouble();
                scan.nextLine();

        System.out.println("Digite o tipo de combustível: ");
        String combustivel = scan.nextLine();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int desc = 0;
        double total = 0;
        double totalDesc = 0;

        if (combustivel.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                desc = 3;
            } else {
                desc = 5;
            }

            total = litros * precoAlc;

        } else if (combustivel.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                desc = 4;
            } else {
                desc = 6;
            }

            total = litros * precoGas;
        }

        totalDesc = (total / 100) * desc;

        double precoPagar = total - totalDesc;

        System.out.println("Valor a ser pago: " + precoPagar);
    }
}
