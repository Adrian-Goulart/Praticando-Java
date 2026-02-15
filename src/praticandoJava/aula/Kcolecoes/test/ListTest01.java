package praticandoJava.aula.Kcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names1.add("Yorushika");
        names1.add("Zutomayo");
        names1.add("Ado");

        names2.add("Kenshi Yonezu");
        names2.add("Creepy Nuts");
        names2.add("Natori");
        names2.add("Eve");

        names1.addAll(names2);

        for (String name : names1) {
            System.out.println(name);
        }

        System.out.println("---------------");
        // Por meio do index
        int size = names1.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names1.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // O número será transformado em Wrapper
    }
}
