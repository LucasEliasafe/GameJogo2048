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
        boolean movimentado = false;
        Movimentos movimentos = new Movimentos(tabuleiro);
        switch (direcao)  {
            case "w":
                movimentado = movimentos.moverParaCima();
                break;
            case "s":
                movimentado = movimentos.moverParaBaixo();
                break;
            case "a":
                movimentado = movimentos.moverParaEsquerda();
                break;
            case "d":
                movimentado = movimentos.moverParaDireita();
                break;
            default:
                System.out.println("Movimento inválido! Use w (cima) s (baixo), a (esquerda), d (direita).";
        }
        if (movimentado) {
            adicionarNovoNumero();
        }
        return movimentado;

        }

        public boolean verificarFimDeJogo(){
            for (int i = 0; i < TAMANHO; i ++){
                for (int j = 0; j < TAMANHO; j++) {
                    if (tabuleiro[i][j] == 0){
                        return false;
                    }
                    if (i < TAMANHO - 1 && tabuleiro[i][j] == tabuleiro[i + 1][j]){
                        return false;
                    }
                    if (j < TAMANHO - 1 && tabuleiro[i][j] == tabuleiro[i][j+1]) {
                        return false;
                    }
                }
            }
            return false;
        }
    }






