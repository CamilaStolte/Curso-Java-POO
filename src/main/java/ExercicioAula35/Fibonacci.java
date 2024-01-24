package ExercicioAula35;

public class Fibonacci {
	 public static void main(String[] args) {
	        int n = 10; 
	        long resultado = calcularFibonacci(n);
	        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + resultado);
	    }

	    public static long calcularFibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
	        }
	}

}
