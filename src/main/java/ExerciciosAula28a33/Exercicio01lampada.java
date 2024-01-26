package ExerciciosAula28a33;

public class Exercicio01lampada {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.acender();
        lampada.mostrarEstado();

        lampada.apagar();
        lampada.mostrarEstado();

        lampada.inverterEstado();
        lampada.mostrarEstado();

        if (lampada.estaLigada()) {
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
