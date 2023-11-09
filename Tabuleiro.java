public class Tabuleiro {
    public static final String EMPTY_SYMBOL = " ";
    private String[][] posicoes;
    private int qtdJogadas;

    public Tabuleiro() {
        posicoes = new String[3][3];
        for (int i = 0; i < posicoes.length; i++) {
            for (int j = 0; j < posicoes[i].length; j++) {
                posicoes[i][j] = EMPTY_SYMBOL;
            }
        }
        qtdJogadas = 0;
    }

    public String getPosicao(int linha, int coluna) {
        return posicoes[linha][coluna];
    }

    public void setPosicao(int linha, int coluna, String valor) {
        if (posicoes[linha][coluna].equals(EMPTY_SYMBOL)) {
            posicoes[linha][coluna] = valor;
            qtdJogadas++;
        }
    }

    public int getQtdJogadas() {
        return qtdJogadas;
    }

    public boolean verificaVitoria(String sinal) {
        if ((posicoes[0][0].equals(sinal) && posicoes[0][1].equals(sinal) && posicoes[0][2].equals(sinal)) || // linha 1
            (posicoes[1][0].equals(sinal) && posicoes[1][1].equals(sinal) && posicoes[1][2].equals(sinal)) || // linha 2
            (posicoes[2][0].equals(sinal) && posicoes[2][1].equals(sinal) && posicoes[2][2].equals(sinal)) || // linha 3
            (posicoes[0][0].equals(sinal) && posicoes[1][0].equals(sinal) && posicoes[2][0].equals(sinal)) || // coluna 1
            (posicoes[0][1].equals(sinal) && posicoes[1][1].equals(sinal) && posicoes[2][1].equals(sinal)) || // coluna 2
            (posicoes[0][2].equals(sinal) && posicoes[1][2].equals(sinal) && posicoes[2][2].equals(sinal)) || // coluna 3
            (posicoes[0][0].equals(sinal) && posicoes[1][1].equals(sinal) && posicoes[2][2].equals(sinal)) || // diagonal
            (posicoes[0][2].equals(sinal) && posicoes[1][1].equals(sinal) && posicoes[2][0].equals(sinal))) { // diagonal inversa
            return true;
        }
        return false;
    }
    
}
