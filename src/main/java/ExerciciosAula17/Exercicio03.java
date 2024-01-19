package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		 boolean infoValida = false;
	        String nome, sexo, estadoCivil;
	        int idade;
	        double salario;

	        do {
	            System.out.println("Digite o nome: ");
	            nome = scan.nextLine();

	            if (nome.length() > 3) {
	                infoValida = true;
	            } else {
	                System.out.println(" Nome precisa ter no mínimo 3 caracteres.");
	            }

	        } while (!infoValida);

	        infoValida = false;

	        do {
	            System.out.println("Digite a idade: ");
	            idade = scan.nextInt();

	            if (idade >= 0 && idade <= 150) {
	                infoValida = true;
	            } else {
	                System.out.println(" Idade precisa ser entre 0 e 150.");
	            }
	        } while (!infoValida);

	        infoValida = false;

	        do {
	            System.out.println("Digite o salário: ");
	            salario = scan.nextDouble();

	            if (salario > 0) {
	                infoValida = true;
	            } else {
	                System.out.println(" Salário precisa ser maior que 0.");
	            }
	        } while (!infoValida);

	        infoValida = false;

	        do {
	            System.out.println("Digite o sexo: ");
	            sexo = scan.next();

	            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
	                infoValida = true;
	            } else {
	                System.out.println("Sexo precisa ser (f) feminino ou (m) masculino.");
	            }
	        } while (!infoValida);

	        infoValida = false;

	        do {
	            System.out.println("Digite o estado civil: ");
	            estadoCivil = scan.next();

	            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
	                    estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
	                infoValida = true;
	            } else {
	                System.out.println("Estado civil precisa ser: (s) solteiro, (c) casado, (v) viúvo, (d) divorciado.");
	            }
	        } while (!infoValida);

	        System.out.println("Informações coletadas:");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Salário: " + salario);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + estadoCivil);
	    }
	}
