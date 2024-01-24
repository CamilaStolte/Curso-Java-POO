package ExerciciosAula34;

import java.util.Scanner;

public class Exercicio03fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Calcular e exibir o fatorial usando o método da classe Calculadora
        long resultadoFatorial = Fatorial.calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultadoFatorial);

    }
}