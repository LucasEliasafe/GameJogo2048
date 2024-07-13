import java.util.Random;
import java.util.Scanner;

public class Jogo2048 {
    private Tabuleiro tabuleiro;

    public Game2048() {
        tabuleiro = new Tabuleiro();
        tabuleiro.iniciarJogo();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        while (!tabuleiro.verificarFimDeJogo()) {
            tabuleiro.imprimirTabuleiro();
            System.out.println("Faça um movimento (w, s, a, d");
            String movimento = scanner.nextLine();
            if (!tabuleiro.movimentar(movimento)) {
                System.out.println("Movimento inválido. Tente novamente");
            }
        }
        tabuleiro.imprimirTabuleiro();
        System.out.println("Fim do Jogo");
        scanner.close();
    }

    public static void main(String[] args) {
        Jogo2048 jogo = new Jogo2048();
        jogo.jogar();

    }

}