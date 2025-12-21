package praticandoJava.pastas.rockPaperScissor.domain;

public enum Item {
    ROCK(1),
    PAPER(2),
    SCISSOR(3);

    public final int NUM_ITEM;

    Item(int numItem) {
        this.NUM_ITEM = numItem;
    }

    public static Item typeItem(int randomNum) {
        for (Item item : values()) {
            if (item.NUM_ITEM == randomNum) {
                return item;
            }
        }
        return null;
    }
}