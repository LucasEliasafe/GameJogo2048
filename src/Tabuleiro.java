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

    }




}
