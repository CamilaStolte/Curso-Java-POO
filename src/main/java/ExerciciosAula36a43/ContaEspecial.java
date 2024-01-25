package ExerciciosAula36a43;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
	    String s = "ContaEspecial\n";
	    s += "limite: " + limite + "\n";
	    s += super.toString();
	    s += "]";
	    return s;
	}

	public boolean sacar(double valor) {
	    double saldoComLimite = this.getSaldo() + limite;

	    if (valor <= saldoComLimite) {
	        this.setSaldo(this.getSaldo() - valor);
	        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	        return true;
	    } else {
	        System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
	        return false;
	    }
	}
}
