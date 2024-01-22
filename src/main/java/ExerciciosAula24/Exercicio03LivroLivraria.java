package ExerciciosAula24;

public class Exercicio03LivroLivraria {

	public static void main(String[] args) {
		
		LivroLivraria Exercicio03LivroLivraria = new LivroLivraria();
		
		Exercicio03LivroLivraria.titulo = "O homem mais rico da babilônia";
		Exercicio03LivroLivraria.autor = "George S. Clason";
		Exercicio03LivroLivraria.editora = "Harper Colins";
		Exercicio03LivroLivraria.anoDePublicacao = 1926;
		Exercicio03LivroLivraria.numeroPaginas = 152;
		Exercicio03LivroLivraria.categoria = "Autoajuda";
		Exercicio03LivroLivraria.formato = "ebook";
		Exercicio03LivroLivraria.preco	= 42.5;
		
		
		System.out.println("Título do livro: " + Exercicio03LivroLivraria.titulo);
		System.out.println("Autor do livro: " + Exercicio03LivroLivraria.autor);
		System.out.println("Editora do livro: " + Exercicio03LivroLivraria.editora);
		System.out.println("Ano de publicação do livro: " + Exercicio03LivroLivraria.anoDePublicacao);
		System.out.println("Número de páginas do livro: " + Exercicio03LivroLivraria.numeroPaginas);
		System.out.println("Categoria do livro: " + Exercicio03LivroLivraria.categoria);
		System.out.println("Formato do livro: " + Exercicio03LivroLivraria.formato);
		System.out.println("Preço do livro: " + Exercicio03LivroLivraria.preco);

	}

}
