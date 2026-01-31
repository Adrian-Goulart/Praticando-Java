package praticandoJava.aula.Gregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Frieren, Fern, Stark, 1000, true";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean bool = scanner.nextBoolean();
                System.out.println("Boolean: " + bool);
            } else {
                System.out.println(scanner.next().trim());
            }
        }
    }
}
