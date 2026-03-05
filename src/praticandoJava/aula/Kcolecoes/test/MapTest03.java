package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Consumer;
import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Vedal");
        Consumer consumer2 = new Consumer("Neurosama");
        Consumer consumer3 = new Consumer("Evil");

        Manga manga1 = new Manga(13579L, "Kusuriya no Hitorigoto", 49.90);
        Manga manga2 = new Manga(24680L, "Sousou no Frieren", 49.90);
        Manga manga3 = new Manga(86420L, "Tongari Boushi no Atelier", 39.90);
        Manga manga4 = new Manga(97531L, "Yu Yu Hakusho", 54.90);
        Manga manga5 = new Manga(19465L, "Houseki no Kuni", 32.90);

        List<Manga> mangaConsumerList1 = List.of(manga4, manga5);
        List<Manga> mangaConsumerList2 = List.of(manga3, manga2);
        List<Manga> mangaConsumerList3 = List.of(manga5, manga4);

        Map<Consumer, List<Manga>> consumerManga = new HashMap<>();
        consumerManga.put(consumer1, mangaConsumerList1);
        consumerManga.put(consumer2, mangaConsumerList2);
        consumerManga.put(consumer3, mangaConsumerList3);
        for (Map.Entry<Consumer, List<Manga>> entry : consumerManga.entrySet()) {
            System.out.print(entry.getKey().getName() + ": ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getName());
            }
        }
    }
}
