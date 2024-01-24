package ExercicioAula35;

public class CalcularN {

	public static void main(String[] args) {
		int n = 5; 

        int soma = calcularSoma(n);
        System.out.println("A soma dos números de 1 até " + n + " é: " + soma);
    }

    public static int calcularSoma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calcularSoma(n - 1);
        }
    }
}