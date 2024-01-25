package ExerciciosAula46;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
    private double base;
    private double altura;

    public Piramide(String cor, double base, double altura) {
        super("Pirâmide", cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (base * base * altura) / 3;
    }
}
