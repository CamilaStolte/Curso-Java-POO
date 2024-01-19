package ExerciciosAula14e15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio18 {

	public static boolean validarData(String dataStr) {
        // Divide a string nos caracteres '/'
	
        String[] partes = dataStr.split("/");
        
        // Verifica se a data possui três partes (dia, mês, ano)
        if (partes.length != 3) {
            return false;
        }
        
        try {
            // Tenta converter as partes para inteiros
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            // Verifica se os valores estão dentro de faixas válidas
            if (1 <= dia && dia <= 31 && 1 <= mes && mes <= 12 && 1900 <= ano && ano <= 2100) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            // Se ocorrer um erro ao converter para inteiros, a data não é válida
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataInput = scanner.nextLine();

        if (validarData(dataInput)) {
            System.out.println("A data é válida e está no formato correto.");
        } else {
            System.out.println("A data não é válida ou não está no formato correto.");
        }

        scanner.close();
    }
}