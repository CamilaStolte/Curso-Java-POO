package ExerciciosAula46;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
    private double aresta;

    public Cubo(String cor, double aresta) {
        super("Cubo", cor);
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }
}