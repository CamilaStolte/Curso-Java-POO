package ExerciciosAula34;

import java.util.Scanner;

public class Exercicio02Calculadora {

	public static void main(String[] args) {
		  int resultadoSoma = Calculadora.somar(5, 3);
	        System.out.println("5 + 3 = " + resultadoSoma);

	        int resultadoSubtracao = Calculadora.subtrair(10, 4);
	        System.out.println("10 - 4 = " + resultadoSubtracao);

	        int resultadoMultiplicacao = Calculadora.multiplicar(6, 7);
	        System.out.println("6 * 7 = " + resultadoMultiplicacao);

	        double resultadoDivisao = Calculadora.dividir(8, 2);
	        System.out.println("8 / 2 = " + resultadoDivisao);

	        double resultadoPotencia = Calculadora.elevarPotencia(2, 3);
	        System.out.println("2^3 = " + resultadoPotencia);

    }
}
		
