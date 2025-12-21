package praticandoJava.pastas.ageverification.domain;

import java.util.Scanner;

public class AgeVerification {
    public int age;

    public static void ageVerification(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Não é possível haver uma idade menor ou igual a zero.");
        }

        if (age < 18) {
            System.out.println("Acesso negado!");
        } else {
            System.out.println("Acesso permitido!");
        }
    }
}