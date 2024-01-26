package ExerciciosAula25a27;

public class Exercicio02ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(1000.0, 500.0);

        conta.sacar(200.0);
        conta.depositar(300.0);
        conta.sacar(1200.0);
        conta.depositar(500.0);

        double saldoFinal = conta.consultarSaldo();
        System.out.println("Saldo final da conta: R$" + saldoFinal);
    }
}



