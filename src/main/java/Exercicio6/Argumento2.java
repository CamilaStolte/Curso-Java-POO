package Exercicio6;

public class Argumento2 {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("Olá mundo! " + args[0]);
		} else {
            System.out.println("Nenhum argumento fornecido.");
		}
	}

}
