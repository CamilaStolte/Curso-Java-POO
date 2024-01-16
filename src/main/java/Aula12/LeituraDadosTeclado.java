package Aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println(" Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é; " + altura);*/
		

		 System.out.println("Digite seu primeiro nome: ");
		 String primeiroNome = scan.next();

		 System.out.println("Digite a sua idade: ");
		 int idade = scan.nextInt();

		 System.out.println("Digite a quantidade de filhos: ");
		 byte qtdFilhos = scan.nextByte();

		 System.out.println("Digite a sua altura: ");
		 float altura = scan.nextFloat();

		 System.out.println("Você tem bichinho de estimação? (true/false): ");
		 boolean temPet = scan.nextBoolean();

		 System.out.println("Você digitou os seguintes valores: ");
		 System.out.println("Primeiro Nome: " + primeiroNome);
		 System.out.println("Idade: " + idade);
		 System.out.println("Quantidade de Filhos: " + qtdFilhos);
		 System.out.println("Altura: " + altura);
		 System.out.println("Tem Bichinho de Estimação: " + temPet);

		    }
		}
