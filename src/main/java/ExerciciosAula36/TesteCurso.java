package ExerciciosAula36;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 Aluno.notasDisciplinas = new double[3][4];

	        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
	            System.out.println("Digite o nome da disciplina " + (i + 1));
	            aluno.nomeDisciplinas[i] = scan.next();
	        }

	        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
	            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
	            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
	                System.out.println("Digite a nota " + (j + 1));
	                aluno.notasDisciplinas[i][j] = scan.nextDouble();
	            }
	}

}
