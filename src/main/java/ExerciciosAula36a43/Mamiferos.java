package ExerciciosAula36a43;

public class Mamiferos extends Animais{
	private String tipoAlimento;

    public Mamiferos(String nomeAnimal, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String tipoAlimento) {
        super(nomeAnimal, comprimento, numPatas, cor, ambiente, velocidade);
        this.tipoAlimento = tipoAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Alimento: " + tipoAlimento;
    }
}