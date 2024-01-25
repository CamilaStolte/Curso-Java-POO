package ExerciciosAula36a43;

public abstract class ContribuinteIR {

    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nRenda Bruta: " + rendaBruta;
    }
}
