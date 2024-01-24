package ExerciciosAula36;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nome;
    private List<Contato> contatos;

    // Construtor da classe Agenda
    public Agenda(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    // Método para adicionar um contato à agenda
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Método para obter a lista de contatos na agenda
    public List<Contato> getContatos() {
        return contatos;
    }
}
