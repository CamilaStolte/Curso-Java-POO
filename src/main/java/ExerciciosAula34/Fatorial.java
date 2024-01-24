package ExerciciosAula34;

public class Fatorial {
    public static long calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("Erro: Fatorial não está definido para números negativos.");
            return -1; 
        }         else if (n == 0 || n == 1) {
            return 1;
        }   else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
