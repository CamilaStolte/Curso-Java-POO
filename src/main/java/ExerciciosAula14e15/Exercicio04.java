package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
          
                System.out.println("A letra é uma vogal.");
                break;
            default:
                System.out.println("A letra é uma consoante.");
        }

    }
}
