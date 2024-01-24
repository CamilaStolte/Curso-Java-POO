package ExerciciosAula36;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
    private List<Aluno> alunos;
	
    public Curso(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public double calcularMediaTurma() {
        double somaMedias = 0;
        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }
        return somaMedias / alunos.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do Professor
        Professor professor = new Professor("NomeProfessor", "DepartamentoXYZ", "professor@email.com");

        // Criação do Curso
        Curso curso = new Curso("NomeCurso", "HorarioXYZ", professor);

        // Criação de 5 Alunos
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o nome do Aluno " + i + ": ");
            String nomeAluno = scanner.nextLine();

            System.out.println("Digite a matrícula do Aluno " + i + ": ");
            int matriculaAluno = scanner.nextInt();

            Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

            // Entrada das 4 notas do Aluno
            System.out.println("Digite as 4 notas do Aluno " + i + ": ");
            double[] notasAluno = new double[4];
            for (int j = 0; j < 4; j++) {
                notasAluno[j] = scanner.nextDouble();
            }

            aluno.setNotas(notasAluno);

            // Adição do Aluno ao Curso
            curso.adicionarAluno(aluno);

        }

        // Exibir a média da turma e se estão aprovados
        System.out.println("Média da Turma: " + curso.calcularMediaTurma());
        System.out.println("Situação dos Alunos:");

        for (Aluno aluno : curso.getAlunos()) {
            System.out.println(aluno.getNome() + ": Média - " + aluno.calcularMedia() + ", Aprovado - " + aluno.estaAprovado());
        }

      
    }
}