package praticandoJava.pastas.RockPaperScissor.domain;

import praticandoJava.pastas.RockPaperScissor.domain.Item;

public class Game {
    private int min = 1;
    private int max = 3;
    private int range = (max - min) + 1;
    private int random = (int) ((range * Math.random()) + min);
    Item item = Item.typeItem(random);

    public static Item playerNumChoise;

    public Game(Item playerNumChoise) {
        this.playerNumChoise = playerNumChoise;
    }

    public void Play() {
        System.out.println("Escolha do jogador: " + playerNumChoise);
        System.out.println("Escolha da máquina: " + item);

        GameResult();
    }

    public void GameResult() {
        if (playerNumChoise == item) {
            System.out.println("Empate!!");
        }

        if (playerNumChoise == Item.ROCK && item == Item.SCISSOR) {
            System.out.println("Ponto para o jogador!!");

        } else if (playerNumChoise == Item.ROCK && item == Item.PAPER) {
            System.out.println("A máquina pontuou!");

        }
        if (playerNumChoise == Item.PAPER && item == Item.ROCK) {
            System.out.println("Ponto para o jogador!!");

        } else if (playerNumChoise == Item.PAPER && item == Item.SCISSOR) {
            System.out.println("A máquina pontuou!");

        }
        if (playerNumChoise == Item.SCISSOR && item == Item.PAPER) {
            System.out.println("Ponto para o jogador!!");

        } else if (playerNumChoise == Item.SCISSOR && item == Item.ROCK) {
            System.out.println("A máquina pontuou!");

        }
    }
}