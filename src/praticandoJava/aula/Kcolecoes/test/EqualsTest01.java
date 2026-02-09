package praticandoJava.aula.Kcolecoes.test;

import praticandoJava.aula.Kcolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("2578", "ABCDE");
        Smartphone s2 = new Smartphone("2578", "ABCDE");
        System.out.println(s1.equals(s2));
    }
}
