package ExerciciosAula28a33;

public class Lampada {
    private boolean ligada; // Indica se a lâmpada está ligada (true) ou desligada (false)

    // Getter para o atributo 'ligada'
    public boolean isLigada() {
        return ligada;
    }

    // Setter para o atributo 'ligada'
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

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
