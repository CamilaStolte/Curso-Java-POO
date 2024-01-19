package ExerciciosAula17;

public class Exercicio29 {

	public static void main(String[] args) {
	    System.out.println("Loja Quase Dois - Tabela de preços");

        double precoBase = 1.99;
        double incremento = 1.99;

        for (int produto = 1; produto <= 50; produto++) {
            double preco = precoBase + (incremento * (produto - 1));
            System.out.println(produto + " - R$ " + preco);
        }
    }
}