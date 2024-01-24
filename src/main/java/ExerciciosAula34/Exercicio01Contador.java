package ExerciciosAula34;

public class Exercicio01Contador {
	public static void main(String[] args) {
	    Contador c1 = new Contador();
	    Contador c2 = new Contador();
	
	    System.out.println("Valor inicial do contador: " + Contador.obterValor());
	
	    Contador.incrementador();
	    System.out.println("Contador após incremento: " + Contador.obterValor());
	
	    Contador.zerarContador();
	    System.out.println("Contador após zerar: " + Contador.obterValor());
	}
}