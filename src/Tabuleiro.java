import java.util.Random;

public class Tabuleiro {
    private static final int TAMANHO = 4;
    private int [][] tabuleiro;
    private Random random;

    public Tabuleiro() {
        tabuleiro = new int[TAMANHO][TAMANHO];
        random = new Random();
    }

    public void inciarJogo(){
        adicionarNovoNumero();
        adicionarNovoNumero();
    }

    private void adicionarNovoNumero(){
        int linha, coluna;
        do {
            linha = random.nextInt(TAMANHO);
            coluna = random.nextInt(TAMANHO);
        } while (tabuleiro[linha][coluna] != 0);
        tabuleiro[linha][coluna] = random.nextInt(10) == 0 ? 4 : 2;
    }

    public void imprimirTabuleiro(){
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(tabuleiro[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean movimentar (String direcao){

    }





}
