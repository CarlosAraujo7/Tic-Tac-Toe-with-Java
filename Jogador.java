public class Jogador {
    public static final String X_SYMBOL = "X";
    public static final String O_SYMBOL = "O";

    private int id;
    private int linha, coluna;
    private Menu menu = new Menu();

    public Jogador(int id_jogador) {
        this.id = id_jogador;
    }

    public int getid() {
        return this.id;
    }

    public void jogada(Tabuleiro tabuleiro, int linha, int coluna) {
        tabuleiro.setPosicao(linha, coluna, (id == 1) ? X_SYMBOL : O_SYMBOL);
    }

    public void jogada(Tabuleiro tabuleiro) {
        do {
            System.out.println("É a vez do jogador " + getid());

            do {
                linha = menu.lerLinha();
            } while (linha < 0 || linha > 2);

            do {
                coluna = menu.lerColuna();
            } while (coluna < 0 || coluna > 2);

            if (!tabuleiro.getPosicao(linha, coluna).equals(" ")) {
                System.out.println("Erro: Essa jogada já foi efetuada!");
                menu.imprimeTabuleiro(tabuleiro);
                continue;
            }
        } while (!tabuleiro.getPosicao(linha, coluna).equals(" "));

        jogada(tabuleiro, linha, coluna);
    }
}
