package Exerciciosaula13;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNum = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNum = scan.nextInt();

        int soma = primeiroNum + segundoNum;

        System.out.println("A soma do primeiro e segundo número é: " + soma);


    }
}
