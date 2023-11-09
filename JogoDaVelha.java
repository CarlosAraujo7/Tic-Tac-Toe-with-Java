import java.util.ArrayList;
import java.util.List;

public class JogoDaVelha {
    public static void main(String[] args) {
        System.out.println("[------------------------------------------------------------------------]");
        System.out.println("[------------------------------JOGO DA VELHA-----------------------------]");
        System.out.println("[------------------------------------------------------------------------]");
        System.out.println("                           INSTRUÇÕES DE JOGO: ");
        System.out.println("=> Para marcar no local desejado digite primeiro a linha e depois a coluna");
        System.out.println("=> Digite de 1 a 3");
        System.out.println("=> O jogador 1 marca com X, e o jogador 2 com O");
        System.out.println("[------------------------------------------------------------------------]");

        List<Jogador> jogadores = new ArrayList<>();
        int indexAtual;

        jogadores.add(new Jogador(1));
        jogadores.add(new Jogador(2));

        Menu menu = new Menu();
        Tabuleiro tabuleiro = new Tabuleiro();
        menu.imprimeTabuleiro(tabuleiro);

        indexAtual = 0;

        while (true) {
            Jogador jogador = jogadores.get(indexAtual);
            jogador.jogada(tabuleiro);

            if (tabuleiro.verificaVitoria(Jogador.X_SYMBOL) || tabuleiro.verificaVitoria(Jogador.O_SYMBOL)) {
                menu.imprimeTabuleiro(tabuleiro);
                System.out.println("A vitória foi do jogador " + jogador.getid());
                break;
            } else if (tabuleiro.getQtdJogadas() == 9) {
                menu.imprimeTabuleiro(tabuleiro);
                System.out.println("Deu empate!");
                break;
            }

            menu.imprimeTabuleiro(tabuleiro);
            indexAtual = (indexAtual + 1) % jogadores.size();
        }
    }
}
