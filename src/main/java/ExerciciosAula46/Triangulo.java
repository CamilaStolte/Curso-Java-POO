package ExerciciosAula46;

public class Triangulo extends Figura2D {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super("Triângulo", cor, altura, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}