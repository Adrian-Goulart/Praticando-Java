package praticandoJava.aula.Inio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "home/adrian/arquivos";
        String textArchieve = "../texto.txt";
        Path path1 = Paths.get(directory, textArchieve);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("home/./adrian/./pasta");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
