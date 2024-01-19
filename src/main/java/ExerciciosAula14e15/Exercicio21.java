package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio21 {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque ");
        System.out.println("Valores disponíveis: 1, 5, 10, 50 e 100");
        System.out.println("Valor mínimo: R$10, máximo: R$600");

        int valor = scan.nextInt();
        int cen = 0;
        int cinq = 0;
        int dez = 0;
        int cin = 0;
        int uni = 0;
        int resto = 0;

        if (valor >= 10 && valor <= 600) {
            // Calcula a quantidade de notas de 100
            cen = valor / 100;
            // Calcula o restante após as notas de 100
            resto = valor % 100;

            // Calcula a quantidade de notas de 50, 10, 5 e 1, respectivamente
            cinq = resto / 50;
            resto %= 50;

            dez = resto / 10;
            resto %= 10;

            cin = resto / 5;
            uni = resto % 5;
        } else {
            System.out.println("Não é possível fazer o saque.");
            return;
        }

        System.out.println("O valor solicitado para o saque é R$ " + valor);
        System.out.println("O valor será distribuído em:");
        System.out.println(cen + " nota(s) de 100");
        System.out.println(cinq + " nota(s) de 50");
        System.out.println(dez + " nota(s) de 10");
        System.out.println(cin + " nota(s) de 5");
        System.out.println(uni + " nota(s) de 1");
    }
}

 