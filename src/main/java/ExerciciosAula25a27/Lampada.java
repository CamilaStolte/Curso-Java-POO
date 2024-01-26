package ExerciciosAula25a27;

public class Lampada {
	
    boolean ligada; // Indica se a lâmpada está ligada (true) ou desligada (false)

    void acender() {
        ligada = true;
    }

    void apagar() {
        ligada = false;
    }

    void inverterEstado() {
        ligada = !ligada;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    boolean estaLigada() {
        return ligada;
    }
}
