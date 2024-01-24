package ExerciciosAula36;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da agenda");
        String nomeAgenda = scan.nextLine();

        // Criar uma instância da classe Agenda com o nome fornecido
        Agenda agenda = new Agenda(nomeAgenda);

        for (int i = 0; i < 3; i++) {
            System.out.println("Contato " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nomeContato = scan.nextLine();
            System.out.print("Email: ");
            String emailContato = scan.nextLine();
            System.out.print("Número: ");
            String numeroContato = scan.nextLine();

            // Criar um objeto Contato com os detalhes fornecidos
            Contato contato = new Contato(nomeContato, emailContato, numeroContato);

            // Adicionar o contato à agenda
            agenda.adicionarContato(contato);
        }

        // Exibir a lista de contatos na agenda
        System.out.println("Contatos na agenda:");
        for (Contato contato : agenda.getContatos()) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Número: " + contato.getNumero());
            System.out.println("--------------");
        }

    }
}
