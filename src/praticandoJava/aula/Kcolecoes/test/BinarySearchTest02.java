package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90));
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(19465L, "Houseki no Kuni", 32.90);
        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));
    }
}
