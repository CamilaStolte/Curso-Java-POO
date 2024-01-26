package ExerciciosAula28a33;

import java.util.Scanner;

public class Exercicio03Aluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Digite o nome do curso");
        aluno.curso = scan.next();

        System.out.println("Digite o número da matrícula");
        aluno.matricula = scan.nextInt();

        aluno.nomeDisciplinas = new String[3];
        aluno.notasDisciplinas = new double[3][4];

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

        aluno.mostrarInfo();
    }
}