package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Manga;
import praticandoJava.aula.Kcolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getBrand().compareTo(s2.getBrand());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("321", "Samsung");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90, 8));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90, 0));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90, 0));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90, 11));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90, 9));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
