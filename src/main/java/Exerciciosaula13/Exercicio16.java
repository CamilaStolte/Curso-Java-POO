package Exerciciosaula13;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
        double area = scanner.nextDouble();

        double litrosNecessarios = area / 3;

        int latas = (int) Math.ceil(litrosNecessarios / 18);
        double custoTotal = latas * 80;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latas);
        System.out.println("Preço total: R$ " + custoTotal);
    }
}