package ExerciciosAula46;

public class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
	public Figura3D(String nome, String cor){
		super (nome, cor);
		
	}
	public double calcularVolume() {
		return 0;

	}
    double profundidade;
	@Override
	public double calcularArea() {
				return 0;
	}
}

