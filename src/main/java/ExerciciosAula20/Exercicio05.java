package ExerciciosAula20;

import java.util.Scanner;


public class Exercicio05 {

	public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        String[][][] compromissos = new String[12][31][8];

	        boolean sair = false;
	        byte opcao;
	        int mes = 0;
	        int dia = 0;
	        int hora = 0;

	        while (!sair) {

	            System.out.println("Digite 1 para adicionar compromisso.");
	            System.out.println("Digite 2 para verificar compromisso.");
	            System.out.println("Digite 0 para sair.");

	            opcao = scan.nextByte();

	            if (opcao == 1) {

	                boolean mesValido = false;

	                while (!mesValido) {
	                    System.out.println("Digite o mês (1 a 12): ");
	                    mes = scan.nextInt();

	                    if (mes >= 1 && mes <= 12) {
	                        mesValido = true;
	                    } else {
	                        System.out.println("Mês inválido. Digite novamente.");
	                    }
	                }

	                boolean diaValido = false;

	                while (!diaValido) {
	                    System.out.println("Digite o dia do mês (1 a 31): ");
	                    dia = scan.nextInt();

	                    if (dia >= 1 && dia <= 31) {
	                        diaValido = true;
	                    } else {
	                        System.out.println("Dia inválido. Digite novamente.");
	                    }
	                }

	                boolean horaValida = false;

	                while (!horaValida) {
	                    System.out.println("Digite a hora do compromisso (0 a 7): ");
	                    hora = scan.nextInt();

	                    if (hora >= 0 && hora < 8) {
	                        horaValida = true;
	                    } else {
	                        System.out.println("Hora inválida. Digite novamente.");
	                    }
	                }

	                System.out.println("Digite o compromisso:");
	                compromissos[mes - 1][dia - 1][hora] = scan.next();

	            } else if (opcao == 2) {

	                boolean mesValido = false;

	                while (!mesValido) {
	                    System.out.println("Digite o mês (1 a 12): ");
	                    mes = scan.nextInt();

	                    if (mes >= 1 && mes <= 12) {
	                        mesValido = true;
	                    } else {
	                        System.out.println("Mês inválido. Digite novamente.");
	                    }
	                }

	                boolean diaValido = false;

	                while (!diaValido) {
	                    System.out.println("Digite o dia do mês (1 a 31): ");
	                    dia = scan.nextInt();

	                    if (dia >= 1 && dia <= 31) {
	                        diaValido = true;
	                    } else {
	                        System.out.println("Dia inválido. Digite novamente.");
	                    }
	                }

	                boolean horaValida = false;

	                while (!horaValida) {
	                    System.out.println("Digite a hora para verificar os compromissos (0 a 7): ");
	                    hora = scan.nextInt();

	                    if (hora >= 0 && hora < 8) {
	                        horaValida = true;
	                    } else {
	                        System.out.println("Hora inválida. Digite novamente.");
	                    }
	                }

	                String compromisso = compromissos[mes - 1][dia - 1][hora];

	                if (compromisso != null && !compromisso.isEmpty()) {
	                    System.out.println("Compromisso encontrado: " + compromisso);
	                } else {
	                    System.out.println("Nenhum compromisso agendado para esta data e hora.");
	                }

	            } else if (opcao == 0) {
	                sair = true;
	            } else {
	                System.out.println("Opção inválida, digite novamente.");
	            }
	        }
	        System.out.println("Saindo do programa. Até logo!");
	    }
	}