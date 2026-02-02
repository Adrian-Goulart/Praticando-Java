package praticandoJava.aula.Inio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
//        Path dir = Paths.get("/home/adrian");
//        Path archieve = Paths.get("/home/adrian/jpops/musics.txt");
//        Path pathToArchieve = dir.relativize(archieve);
//        System.out.println(pathToArchieve);

        Path absolute1 = Paths.get("/home/adrian");
        Path absolute2 = Paths.get("/usr/games");
        Path absolute3 = Paths.get("/home/adrian/jpops/musics.txt");
        Path relative1 = Paths.get("artists");
        Path relative2 = Paths.get("artists/artists.txt");

        System.out.println("1- "+absolute1.relativize(absolute3));
        System.out.println("2- "+absolute3.relativize(absolute1));

        System.out.println("3- "+absolute1.relativize(absolute2));
        System.out.println("4- "+relative1.relativize(relative2));

        System.out.println("5- "+absolute1.relativize(relative1)); // O Java não faz ideia de onde encontrar
    }
}
