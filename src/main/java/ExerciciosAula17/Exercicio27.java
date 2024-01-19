package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		 System.out.println("Digite a quantidade de turmas?");
	        int turmas = scanner.nextInt();

	        int totalAlunos = 0;

	        for (int i = 1; i <= turmas; i++) {
	            System.out.println("Informe a quantidade de alunos na turma " + i + ":");
	            int alunosNaTurma = scanner.nextInt();

	            // Verifica se a quantidade de alunos na turma é válida
	            if (alunosNaTurma > 0) {
	                totalAlunos += alunosNaTurma;
	            } else {
	                System.out.println("Quantidade de alunos inválida. Por favor, informe um valor positivo.");
	                i--; // Decrementa o índice para repetir a entrada para esta turma.
	            }
	        }

	        if (turmas > 0) {
	            double mediaAlunosPorTurma = (double) totalAlunos / turmas;

	            System.out.println("\nMédia de alunos por turma: " + mediaAlunosPorTurma);
	        } else {
	            System.out.println("Número de turmas inválido. Informe pelo menos uma turma.");
	        }
	    }
	}
