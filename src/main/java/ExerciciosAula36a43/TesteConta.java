package ExerciciosAula36a43;

public class TesteConta {
    public static void main(String[] args) {

        System.out.println("*** Teste conta bancária ***");

        // Teste Conta Simples
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("1111");
        contaSimples.depositar(100);

        System.out.println(contaSimples);

        if (contaSimples.sacar(50)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + contaSimples.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de 50, saldo de = " + contaSimples.getSaldo());
        }

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println("\n*** Teste conta poupança ***");

        // Teste Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("2222");
        contaPoupanca.depositar(200);
        contaPoupanca.setDiaRendimento(20);

        System.out.println(contaPoupanca);

        if (contaPoupanca.sacar(150)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de 150, saldo de = " + contaPoupanca.getSaldo());
        }

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        System.out.println("\n*** Teste conta especial ***");

        // Teste Conta Especial
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("3333");
        contaEspecial.depositar(300);
        contaEspecial.setLimite(100);

        System.out.println(contaEspecial);

        if (contaEspecial.sacar(250)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + contaEspecial.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de 250, saldo de = " + contaEspecial.getSaldo());
        }

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 500); // Tentando sacar mais do que o limite

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ", saldo de = " + conta.getSaldo());
        }
    }
}
