package ExerciciosAula36a43;

public class TesteAnimais {
	 public static void main(String[] args) {
	     Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinza", "Oceano", 25.0);
	     Mamiferos ursoCanada = new Mamiferos("Urso do Canadá", 180, 4, "Marrom", "Floresta", 30.0, "Onívoro");
	     Animais camelo = new Animais("Camelo", 250, 4, "Bege", "Deserto", 20.0) {
	         
	     };
	
	     // Testando métodos e polimorfismo
	     System.out.println("Detalhes do Tubarão:\n" + tubarao);
	
	     System.out.println("\nDetalhes do Urso do Canadá:\n" + ursoCanada);
	
	     System.out.println("\nDetalhes do Camelo:\n" + camelo);
	 }
}
