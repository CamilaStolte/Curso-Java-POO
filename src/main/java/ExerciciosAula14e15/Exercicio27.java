package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de morango: ");
        double qtdMorango = scan.nextDouble();

        System.out.println("Digite a quantidade de maçã: ");
        double qtdMaca = scan.nextDouble();

        double precokgMorango = 0;

        if (qtdMorango <= 5) {
            precokgMorango = 2.5;
        } else {
            precokgMorango = 2.2;
        }

        double precokgMaca = 0;

        if (qtdMaca <= 5) {
            precokgMaca = 1.8;
        } else {
            precokgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precokgMorango;
        double precoTotalMaca = qtdMaca * precokgMaca;
        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if (qtdMorango + qtdMaca > 8 || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        
        System.out.println("Preço total = " + precoTotal);
    }
}
