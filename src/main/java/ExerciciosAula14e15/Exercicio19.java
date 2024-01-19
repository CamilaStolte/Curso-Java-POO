package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro menor que 1000:");
        int numero = scan.nextInt();

        if (numero < 1000) {
            int centenas = numero / 100;
            int restoCentenas = numero % 100;

            int dezenas = restoCentenas / 10;
            int unidades = restoCentenas % 10;

            System.out.println( numero + "= Centenas: " + centenas + ", Dezenas: " + dezenas + ", e Unidades:" + unidades);
        } else {
            System.out.println("Número deve ser menor que 1000.");
        }
    }
}