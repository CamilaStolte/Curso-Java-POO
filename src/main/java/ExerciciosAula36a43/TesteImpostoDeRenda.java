package ExerciciosAula36a43;

public class TesteImpostoDeRenda {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Fulano");
        pessoaFisica.setRendaBruta(2000.0);
        pessoaFisica.setCpf("123.456.789-01");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa XYZ");
        pessoaJuridica.setRendaBruta(50000.0);
        pessoaJuridica.setCnpj("12.345.678/0001-90");

        // Testando o cálculo de imposto
        System.out.println("Imposto Pessoa Física: R$" + pessoaFisica.calcularImposto());
        System.out.println("Imposto Pessoa Jurídica: R$" + pessoaJuridica.calcularImposto());

        // Testando o método toString()
        System.out.println("\nDetalhes Pessoa Física:\n" + pessoaFisica);
        System.out.println("\nDetalhes Pessoa Jurídica:\n" + pessoaJuridica);
    }
}
