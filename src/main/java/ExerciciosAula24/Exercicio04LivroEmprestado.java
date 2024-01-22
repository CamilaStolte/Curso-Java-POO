package ExerciciosAula24;

import java.util.Date;

public class Exercicio04LivroEmprestado {

    public static void main(String[] args) {
        LivroEmprestado exercicio04LivroEmprestado = new LivroEmprestado();

        exercicio04LivroEmprestado.titulo = "O homem mais rico da babilônia";
        exercicio04LivroEmprestado.autor = "George S. Clason";
        exercicio04LivroEmprestado.editora = "Harper Collins";
        exercicio04LivroEmprestado.anoDePublicacao = 1926;
        exercicio04LivroEmprestado.numeroPaginas = 152;
        exercicio04LivroEmprestado.categoria = "Autoajuda";
        exercicio04LivroEmprestado.emprestado = true;
        exercicio04LivroEmprestado.dataEntrega = new Date(124, 1, 25);
        exercicio04LivroEmprestado.emprestadoA = "Fulana";

        System.out.println("Título do livro: " + exercicio04LivroEmprestado.titulo);
        System.out.println("Autor do livro: " + exercicio04LivroEmprestado.autor);
        System.out.println("Editora do livro: " + exercicio04LivroEmprestado.editora);
        System.out.println("Ano de publicação do livro: " + exercicio04LivroEmprestado.anoDePublicacao);
        System.out.println("Número de páginas do livro: " + exercicio04LivroEmprestado.numeroPaginas);
        System.out.println("Categoria do livro: " + exercicio04LivroEmprestado.categoria);
        System.out.println("O livro foi emprestado? " + exercicio04LivroEmprestado.emprestado);
        System.out.println("Data de entrega do livro: " + exercicio04LivroEmprestado.dataEntrega);
        System.out.println("Emprestado a: " + exercicio04LivroEmprestado.emprestadoA);
    }
}
