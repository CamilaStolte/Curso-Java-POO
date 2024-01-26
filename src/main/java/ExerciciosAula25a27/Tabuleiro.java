package ExerciciosAula25a27;

public class Tabuleiro {
	private Character[][] tabuleiro;

    public Tabuleiro() {
        this.tabuleiro = new Character[3][3];
    }

    public void realizarJogada(int linha, int coluna, Jogador jogador) {
    	if (linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3 && tabuleiro[linha - 1][coluna - 1] == null) {
            tabuleiro[linha - 1][coluna - 1] = jogador.getMarca();
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
        }
    }
    public void mostrarTabuleiro() {
    	 System.out.println("-------");
         for (Character[] linha : tabuleiro) {
             System.out.print("|");
             for (Character coluna : linha) {
                 if (coluna != null) {
                     System.out.print(coluna);
                 } else {
                     System.out.print(" ");
                 }
                 System.out.print("|");
             }
             System.out.println();
             System.out.println("-------");
         }
    }
    public boolean verificarVitoria(Jogador jogador) {
        return verificaLinhas(jogador) || verificaColunas(jogador) || verificaDiagonais(jogador);
    }
    private boolean verificaLinhas(Jogador jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != null && tabuleiro[i][1] != null && tabuleiro[i][2] != null &&
                tabuleiro[i][0] == jogador.getMarca() &&
                tabuleiro[i][1] == jogador.getMarca() &&
                tabuleiro[i][2] == jogador.getMarca()) {
                return true; 
            }
        }
        return false;
    }


    private boolean verificaColunas(Jogador jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] != null && tabuleiro[1][i] != null && tabuleiro[2][i] != null &&
                tabuleiro[0][i] == jogador.getMarca() &&
                tabuleiro[1][i] == jogador.getMarca() &&
                tabuleiro[2][i] == jogador.getMarca()) {
                return true; 
            }
        }
        return false;
    }

    private boolean verificaDiagonais(Jogador jogador) {
        if ((tabuleiro[0][0] != null && tabuleiro[1][1] != null && tabuleiro[2][2] != null &&
             tabuleiro[0][0] == jogador.getMarca() &&
             tabuleiro[1][1] == jogador.getMarca() &&
             tabuleiro[2][2] == jogador.getMarca()) ||
            (tabuleiro[0][2] != null && tabuleiro[1][1] != null && tabuleiro[2][0] != null &&
             tabuleiro[0][2] == jogador.getMarca() &&
             tabuleiro[1][1] == jogador.getMarca() &&
             tabuleiro[2][0] == jogador.getMarca())) {
            return true; 
        }
        return false;
    }


    public boolean verificarEmpate() {
        int totalJogadas = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] != null) {
                    totalJogadas++;
                }
            }
        }

        return totalJogadas == 9;
    }
}