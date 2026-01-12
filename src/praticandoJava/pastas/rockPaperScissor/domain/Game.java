package praticandoJava.pastas.rockPaperScissor.domain;

public class Game {
    private int min = 1;
    private int max = 3;
    private int range = (max - min) + 1;
    private int random = (int) ((range * Math.random()) + min);
    Item item = Item.typeItem(random);

    public static Item playerChoise;

    public Game(Item playerChoise) {
        this.playerChoise = playerChoise;
    }

    public void Play() {


        System.out.println("Escolha do jogador: " + playerChoise);
        System.out.println("Escolha da máquina: " + item);

        GameResult();
    }

    public void GameResult() {
        if (playerChoise == item) {
            System.out.println("Empate!!");
        }

        if (playerChoise == Item.ROCK && item == Item.SCISSOR) {
            System.out.println("Ponto para o jogador!!");

        } else if (playerChoise == Item.ROCK && item == Item.PAPER) {
            System.out.println("A máquina pontuou!");

        }

        if (playerChoise == Item.PAPER && item == Item.ROCK) {
            System.out.println("Ponto para o jogador!!");

        } else if (playerChoise == Item.PAPER && item == Item.SCISSOR) {
            System.out.println("A máquina pontuou!");

        }

        if (playerChoise == Item.SCISSOR && item == Item.PAPER) {
            System.out.println("Ponto para o jogador!!");

        } else if (playerChoise == Item.SCISSOR && item == Item.ROCK) {
            System.out.println("A máquina pontuou!");

        }
    }
}