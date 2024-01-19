package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite um número");
        int num = scan.nextInt(); 
        
        boolean ehPrimo = true;

        // Um número primo é um número natural maior que 1 e que não possui divisores além de 1 e ele mesmo.
        // Portanto, precisamos verificar se o número é divisível por algum número no intervalo de 2 a (num - 1).
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // Se for divisível por algum número no intervalo, não é primo
                ehPrimo = false;
                break;
            }
        }
      
        if (num > 1 && ehPrimo) {
            System.out.println("O número informado é um número primo: " + num);
        } else {
            System.out.println("O número informado não é um número primo.");
        }
    }
}