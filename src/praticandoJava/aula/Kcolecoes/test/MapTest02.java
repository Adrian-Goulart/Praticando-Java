package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Consumer;
import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Vedal");
        Consumer consumer2 = new Consumer("Neurosama");
        Consumer consumer3 = new Consumer("Evil");

        Manga manga1 = new Manga(13579L, "Kusuriya no Hitorigoto", 49.90);
        Manga manga2 = new Manga(24680L, "Sousou no Frieren", 49.90);
        Manga manga3 = new Manga(86420L, "Tongari Boushi no Atelier", 39.90);
        Manga manga4 = new Manga(97531L, "Yu Yu Hakusho", 54.90);
        Manga manga5 = new Manga(19465L, "Houseki no Kuni", 32.90);

        Map<Consumer, Manga> consumerManga = new HashMap<>();
        consumerManga.put(consumer1, manga4);
        consumerManga.put(consumer2, manga3);
        consumerManga.put(consumer3, manga1);
        for (Map.Entry<Consumer, Manga> entry : consumerManga.entrySet()) {
            System.out.println(entry.getKey().getName()+" : "+entry.getValue().getName());
        }
    }
}
