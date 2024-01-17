package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Sua média foi: " + media + ". Você está aprovado!");
        } else if (media < 7) {
            System.out.println("Sua média foi: " + media + ". Você está reprovado!");
        } else if (media == 10) {
            System.out.println("Sua média foi: " + media + ". Você foi aprovado com distinção!");
        } else {
        	System.out.println("Valor inválido, favor insira uma nota de 1 até 10.");
        }

    }
}
