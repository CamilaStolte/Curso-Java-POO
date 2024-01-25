package ExerciciosAula52;

public class Contato {
    private String nome;
    private int telefone;
    private int identificador;
    private static int contador = 0;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = ++contador;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void imprimirInfo() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
