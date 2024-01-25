package ExerciciosAula36a43;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
	    String s = "ContaBancaria\n";
	    s += "Nome do Cliente: " + nomeCliente + "\n";
	    s += "Número da Conta: " + numConta + "\n";
	    s += "Saldo: " + saldo + "\n";
	    return s;
	}
	
	public boolean sacar(double valorSaque) {
	    if (valorSaque <= saldo) {
	        saldo -= valorSaque;
	        System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
	        return true;
	    } else {
	        System.out.println("Saldo insuficiente para realizar o saque de R$" + valorSaque);
	        return false;
	    }
	}
	public void depositar(double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
	}
	
	
}
 