package praticandoJava.aula.Kcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Yorushika");
        names.add("Zutomayo");
        names.add("Ado");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------------");
        // Por meio do index
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
