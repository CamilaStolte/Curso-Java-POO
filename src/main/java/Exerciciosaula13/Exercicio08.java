package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite o valor que você ganha por hora trabalhada: ");
        double valorPorHora = scan.nextDouble();
        
        if (valorPorHora < 0) {
            System.out.println("O valor por hora não pode ser negativo. Encerrando o programa.");
            return; 
        }

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double quantidadeHoras = scan.nextDouble();

        if (quantidadeHoras < 0) {
            System.out.println("A quantidade de horas não pode ser negativa. Encerrando o programa.");
            return;
        }

        double salarioTotal = valorPorHora * quantidadeHoras;

        System.out.println("O valor total do seu salário no referido mês é: " + salarioTotal);

    }
}
