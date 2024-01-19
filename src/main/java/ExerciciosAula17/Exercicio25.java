package ExerciciosAula17;
import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja calcular a media?");
        int n = scanner.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            somaIdades += scanner.nextInt();
        }

        double mediaIdades = (double) somaIdades / n;

        System.out.println("\nA média das idades é: " + mediaIdades);

        // Categorizando a média das idades
        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("A média das idades é classificada como Jovem.");
        } else if (mediaIdades >= 26 && mediaIdades <= 60) {
            System.out.println("A média das idades é classificada como Adulta.");
        } else {
            System.out.println("A média das idades é classificada como Idosa.");
        }
    }
}
