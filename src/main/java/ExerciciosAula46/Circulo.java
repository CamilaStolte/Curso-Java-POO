package ExerciciosAula46;

public class Circulo extends Figura2D implements DimensaoSuperficial{
    private static final double PI = Math.PI;
    private double raio;

    public Circulo(String cor, double raio) {
        super("Círculo", cor, raio, raio);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }
}
