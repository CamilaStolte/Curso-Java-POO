package ExerciciosAula24;

public class Exercicio01Lampada {

	public static void main(String[] args) {
		
		Lampada Exercicio01Lampada = new Lampada();
		
		Exercicio01Lampada.modelo = "A60";
		Exercicio01Lampada.tensao = "Bivolt";
		Exercicio01Lampada.potencia = 7;
		Exercicio01Lampada.cor = "Amarela";
		Exercicio01Lampada.tipoLuz = "Amarela";
		Exercicio01Lampada.garantiaMeses = 36;
		Exercicio01Lampada.tipoAbajur = true;
		
		Exercicio01Lampada.tipos = new String [5];
		Exercicio01Lampada.tipos[0] = "Abajur";
		Exercicio01Lampada.tipos[1] = "Lampeões";

		System.out.println("Modelo da lâmpada " + Exercicio01Lampada.modelo);
		System.out.println("Tensão da lâmpada " + Exercicio01Lampada.tensao);
		System.out.println("Potência da lâmpada " + Exercicio01Lampada.potencia);
		System.out.println("Cor da lâmpada " + Exercicio01Lampada.cor);
		System.out.println("Tipo de luz da lâmpada " + Exercicio01Lampada.tipoLuz);
		System.out.println("Garantia de meses da lâmpada " + Exercicio01Lampada.garantiaMeses);
	

	}

}
