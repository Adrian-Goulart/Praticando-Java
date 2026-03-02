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

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPrice(), manga2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone1 = new Smartphone("321", "Samsung");
        set.add(smartphone1);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(13579L, "Kimetsu no yaiba", 49.90, 8));
        mangas.add(new Manga(24680L, "Sousou no Frieren", 49.90, 0));
        mangas.add(new Manga(86420L, "Tongari Boushi no Atelier", 39.90, 0));
        mangas.add(new Manga(97531L, "Yu Yu Hakusho", 54.90, 11));
        mangas.add(new Manga(19465L, "Houseki no Kuni", 32.90, 9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaTest = new Manga(76534L, "Kanata no Astra", 49.9, 9);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("-----------");
        System.out.println(mangas.lower(mangaTest));
        System.out.println(mangas.floor(mangaTest));
        System.out.println(mangas.higher(mangaTest));
        System.out.println(mangas.ceiling(mangaTest));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

        System.out.println("---------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}