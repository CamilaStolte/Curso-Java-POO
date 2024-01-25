package ExerciciosAula46;

public class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {
	double base;
    double altura;

    public Figura2D(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
