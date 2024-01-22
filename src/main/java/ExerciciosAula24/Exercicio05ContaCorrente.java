package ExerciciosAula24;

public class Exercicio05ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente Exercicio05ContaCorrente = new ContaCorrente();
		
		Exercicio05ContaCorrente.numeroConta = 124;
		Exercicio05ContaCorrente.agencia = 444464;
		Exercicio05ContaCorrente.saldoConta	= 41545.2;
		Exercicio05ContaCorrente.statusEspecial	= true;
		Exercicio05ContaCorrente.limite = 4500;
		
		
		System.out.println("Número da conta corrente: " + Exercicio05ContaCorrente.numeroConta);
		System.out.println("Agencia da conta corrente: " + Exercicio05ContaCorrente.agencia);
		System.out.println("Saldo da conta corrente: " + Exercicio05ContaCorrente.saldoConta);
		System.out.println("A conta corrente é especial?" + Exercicio05ContaCorrente.statusEspecial);
		System.out.println("Limite da conta corrente: " + Exercicio05ContaCorrente.limite);

	}

}
