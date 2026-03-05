package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.PriorityQueue;

public class QueueTest02 {
    public static void main(String[] args) {
        PriorityQueue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90, 8));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90, 0));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90, 0));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90, 11));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90, 9));

        while(!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
