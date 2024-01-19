package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de CDs:");
        int qtdCds = scan.nextInt();

        double valorInvestido = 0;

        for (int i = 1; i <= qtdCds; i++) {
            System.out.println("Informe o valor do CD " + i + ":");
            double valorCd = scan.nextDouble();
            valorInvestido += valorCd;
        }

        double media = valorInvestido / qtdCds;

        System.out.println("A quantidade de CDs foi: " + qtdCds);
        System.out.println("O valor total investido foi: " + valorInvestido);
        System.out.println("A média de valor investido por CD foi: " + media);
    }
}
