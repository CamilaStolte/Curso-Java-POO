package ExerciciosAula17;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número:");
        int num = scan.nextInt();

        System.out.print(num + "! = " + num);

        int fatorial = num;

        for (int i = num - 1; i > 0; i--) {
            fatorial *= i;
            System.out.print(" * " + i);
        }

        System.out.println(" = " + fatorial);
    }
}
