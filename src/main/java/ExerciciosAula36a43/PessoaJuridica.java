package ExerciciosAula36a43;

public class PessoaJuridica extends ContribuinteIR {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj;
    }
}
