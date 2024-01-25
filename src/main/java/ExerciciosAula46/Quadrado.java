package ExerciciosAula46;

public class Quadrado extends Figura2D implements DimensaoSuperficial {
    private double lado;

    public Quadrado(String cor, double lado) {
        super("Quadrado", cor, lado, lado);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}