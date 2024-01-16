package Exerciciosaula13;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada em metros quadrados: ");
        double tamanhoArea = scanner.nextDouble();

        double litrosNecessarios = tamanhoArea / 6.0;
        litrosNecessarios *= 1.1;

        int latas18L = (int) Math.ceil(litrosNecessarios / 18.0);
        double precoLatas18L = latas18L * 80.0;

        int galoes3_6L = (int) Math.ceil(litrosNecessarios / 3.6);

        double precoGaloes3_6L = galoes3_6L * 25.0;

        int latasMistura = (int) litrosNecessarios / 18;
        int galoesMistura = (int) Math.ceil((litrosNecessarios % 18) / 3.6);

        double precoMistura = (latasMistura * 80.0) + (galoesMistura * 25.0);

        System.out.println("1. Comprar apenas latas de 18 litros:");
        System.out.println("   Quantidade de latas: " + latas18L);
        System.out.println("   Preço: R$ " + precoLatas18L);

        System.out.println("\n2. Comprar apenas galões de 3,6 litros:");
        System.out.println("   Quantidade de galões: " + galoes3_6L);
        System.out.println("   Preço: R$ " + precoGaloes3_6L);

        System.out.println("\n3. Misturar latas e galões:");
        System.out.println("   Quantidade de latas: " + latasMistura);
        System.out.println("   Quantidade de galões: " + galoesMistura);
        System.out.println("   Preço: R$ " + precoMistura);
    }
}
