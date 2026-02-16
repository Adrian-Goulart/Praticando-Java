package praticandoJava.aula.Kcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Kimetsu no yaiba");
        mangas.add("Sousou no Frieren");
        mangas.add("Tongari Boushi no Atelier");
        mangas.add("Yu Yu Hakusho");
        mangas.add("Houseki no Kuni");
        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
