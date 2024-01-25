package ExerciciosAula46;

public class TesteFiguras {

    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];

        figuras[0] = new Circulo("Vermelho", 5.0);
        figuras[1] = new Quadrado("Azul", 4.0);
        figuras[2] = new Triangulo("Amarelo", 3.0, 4.0);
        figuras[3] = new Cubo("Verde", 3.0);
        figuras[4] = new Cilindro("Roxo", 2.0, 5.0);
        figuras[5] = new Piramide("Laranja", 6.0, 8.0);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Figura: " + figura.getNome());
            System.out.println("Cor: " + figura.getCor());

            if (figura instanceof DimensaoSuperficial) {
                double area = ((DimensaoSuperficial) figura).calcularArea();
                System.out.println("Área: " + area);
            }

            if (figura instanceof DimensaoVolumetrica) {
                double volume = ((DimensaoVolumetrica) figura).calcularVolume();
                System.out.println("Volume: " + volume);
            }

            System.out.println("------------------------");
        }
    }
}
