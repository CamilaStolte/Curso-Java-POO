package ExerciciosAula28a33;

public class ContaCorrente {
	
	int numeroConta;
	int agencia;
	double saldoConta;
	double chequeEspecial;
	int limite;
	double saque;
	double deposito;
	
	ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        this.saldoConta = saldoInicial;
        this.chequeEspecial = limiteChequeEspecial;
	}
	
	void sacar(double valorSaque) {
		if (valorSaque <= saldoConta + chequeEspecial) {
			saldoConta -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
            verificarChequeEspecial();
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valorSaque);
        }
	}
	void depositar(double valorDeposito) {
        saldoConta += valorDeposito;
        System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
        verificarChequeEspecial();
	}
    public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double consultarSaldo() {
        return saldoConta;
    }

    private void verificarChequeEspecial() {
        if (saldoConta < 0) {
            System.out.println("Você está utilizando o cheque especial.");
        }
    }
}

