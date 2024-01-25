package ExerciciosAula46;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double raio;
    private double altura;

    public Cilindro(String cor, double raio, double altura) {
        super("Cilindro", cor);
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}