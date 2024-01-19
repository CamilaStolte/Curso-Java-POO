package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo de carne: ");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        int opcaoCarne = scan.nextInt();
        String tipoCarne = "";

        switch (opcaoCarne) {
            case 1:
                tipoCarne = "Filé Duplo";
                break;
            case 2:
                tipoCarne = "Alcatra";
                break;
            case 3:
                tipoCarne = "Picanha";
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                return;
        }

        System.out.println("Digite a quantidade de carne em unidades: ");
        int qtdCarne = scan.nextInt();

        System.out.println("A compra vai ser feita no cartão Tabajara? (sim/não) ");
        String opcaoTabajara = scan.next();
        boolean usarTabajara = opcaoTabajara.equalsIgnoreCase("sim");

        double precoUnitario = 0;

        switch (opcaoCarne) {
            case 1:
                precoUnitario = 4.9;
                break;
            case 2:
                precoUnitario = 5.9;
                break;
            case 3:
                precoUnitario = 6.9;
                break;
        }

        double precoTotal = qtdCarne * precoUnitario;

        if (usarTabajara) {
            double desconto = 0.05;
            double valorDesconto = precoTotal * desconto;
            precoTotal -= valorDesconto;
        }

        System.out.println("Resumo da compra:");
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Quantidade de carne: " + qtdCarne + " unidades");
        System.out.println("Preço total: R$ " + precoTotal);
    }
}
