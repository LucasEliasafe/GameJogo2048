import java.util.Random;

public class Tabuleiro {
    private static final int TAMANHO = 4;
    private int [][] tabuleiro;
    private Random random;

    public Tabuleiro() {
        tabuleiro = new int[TAMANHO][TAMANHO];
        random = new Random();
    }


}
