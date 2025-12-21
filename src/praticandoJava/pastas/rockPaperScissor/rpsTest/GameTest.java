package praticandoJava.pastas.rockPaperScissor.rpsTest;

import praticandoJava.pastas.rockPaperScissor.domain.Game;
import praticandoJava.pastas.rockPaperScissor.domain.Item;


public class GameTest {
    public static void main(String[] args) {
        Game game = new Game(Item.SCISSOR);
        game.Play();
    }
}