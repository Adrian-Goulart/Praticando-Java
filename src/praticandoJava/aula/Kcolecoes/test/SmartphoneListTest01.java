package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1357", "Samsung");
        Smartphone s2 = new Smartphone("2468", "Iphone");
        Smartphone s3 = new Smartphone("1470", "Xiaomi");

        List<Smartphone> smartphoneList = new ArrayList<>(6);
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(0, s3);

        for (Smartphone smartphone : smartphoneList) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("2468", "Iphone");

        System.out.println(smartphoneList.contains(s4));
        int indexSmartphone4 = smartphoneList.indexOf(s4);
        System.out.println(indexSmartphone4);
    }
}
