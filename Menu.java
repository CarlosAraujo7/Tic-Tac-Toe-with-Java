import java.util.Scanner;

public class Menu {
    private Scanner teclado = new Scanner(System.in);

    public Menu() {
    }

    public void imprimeTabuleiro(Tabuleiro tabuleiro) {
        System.out.println("  1 2 3"); // Números das colunas
        System.out.println(" -------");
    
        for (int linha = 0; linha < 3; linha++) {
            System.out.print((linha + 1) + "|"); // Número da linha
            for (int coluna = 0; coluna < 3; coluna++) {
                String simbolo = tabuleiro.getPosicao(linha, coluna);
                if (simbolo.equals(Jogador.X_SYMBOL)) {
                    System.out.print("X");
                } else if (simbolo.equals(Jogador.O_SYMBOL)) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
    
                System.out.print("|");
            }
            System.out.println();
            System.out.println(" -------");
        }
    }
    

    public int lerColuna() {
        System.out.println("Digite a coluna (1 a 3): ");
        int coluna = Integer.parseInt(teclado.nextLine()) - 1; // Subtrai 1 para corresponder aos índices 0 a 2.
        return coluna;
    }
    
    public int lerLinha() {
        System.out.println("Digite a linha (1 a 3): ");
        int linha = Integer.parseInt(teclado.nextLine()) - 1; // Subtrai 1 para corresponder aos índices 0 a 2.
        return linha;
    }
    
}
