package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90, 8));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90, 0));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90, 0));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90, 11));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90, 9));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90, 9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
//         mangas.add(new Manga(32145L, "Kusuriya no Hitorigoto", 49.90,16));