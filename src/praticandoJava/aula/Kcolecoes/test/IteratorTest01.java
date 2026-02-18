package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90, 8));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90, 0));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90, 0));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90, 11));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90, 9));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
