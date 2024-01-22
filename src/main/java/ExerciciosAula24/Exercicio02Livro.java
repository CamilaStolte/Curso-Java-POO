package ExerciciosAula24;

public class Exercicio02Livro {

	public static void main(String[] args) {
		
		Livro  Exercicio02Livro = new Livro();
		
		Exercicio02Livro.titulo = "O homem mais rico da babilônia";
		Exercicio02Livro.autor = "George S. Clason";
		Exercicio02Livro.editora = "Harper Colins";
		Exercicio02Livro.anoDePublicacao = 1926;
		Exercicio02Livro.numeroPaginas = 152;
		Exercicio02Livro.categoria = "Autoajuda";
		
		System.out.println("Título do livro: " + Exercicio02Livro.titulo);
		System.out.println("Autor do livro: " + Exercicio02Livro.autor);
		System.out.println("Editora do livro: " + Exercicio02Livro.editora);
		System.out.println("Ano de publicação do livro: " + Exercicio02Livro.anoDePublicacao);
		System.out.println("Número de páginas do livro: " + Exercicio02Livro.numeroPaginas);
		System.out.println("Categoria do livro: " + Exercicio02Livro.categoria);


	}

}
