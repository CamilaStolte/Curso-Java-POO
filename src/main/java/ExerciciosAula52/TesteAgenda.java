package ExerciciosAula52;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda("Minha Agenda");

        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n **** MENU DE OPÇÕES ****\n");
            System.out.println("1 - Para consultar a agenda.");
            System.out.println("2 - Para adicionar um contato à agenda.");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    agenda.mostrarContatos();
                case 2:
                    scan.nextLine();
                    System.out.print("Digite o nome do contato: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefoneStr = scan.nextLine();

                    try {
                        int telefone = Integer.parseInt(telefoneStr);
                        Contato novoContato = new Contato(nome, telefone);
                        agenda.adicionarContato(novoContato);
                        System.out.println("Contato adicionado com sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: O telefone deve ser um número válido.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

    }
}
