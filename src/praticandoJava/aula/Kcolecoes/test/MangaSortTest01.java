package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90));
        System.out.println("Sem ordenação");
        System.out.println(mangas);

        Collections.sort(mangas);
        System.out.println("Com ordenação por Comparable");
        System.out.println(mangas);

        Collections.sort(mangas, new MangaByIdComparator()); // mangas.sort(new MangaByIdComparator());
        System.out.println("Com ordenação por Comparator");
        System.out.println(mangas);
    }
}
