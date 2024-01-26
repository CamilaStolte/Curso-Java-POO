package ExerciciosAula25a27;


class Aluno {
    String nome;
    String curso;
    int matricula;
    String[] nomeDisciplinas;
    double[][] notasDisciplinas;

    void mostrarInfo() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.println("Disciplina: " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println("   Nota " + (j + 1) + ": " + notasDisciplinas[i][j]);
            }
        }
    }
}


			
	
