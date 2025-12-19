package praticandoJava.pastas.RockPaperScissor.RpsTest;

import praticandoJava.pastas.RockPaperScissor.domain.Game;
import praticandoJava.pastas.RockPaperScissor.domain.Item;


public class GameTest {
    public static void main(String[] args) {
        Game game = new Game(Item.PAPER);
        game.Play();
    }
}