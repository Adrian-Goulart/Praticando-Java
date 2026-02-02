package praticandoJava.aula.Inio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
//        Path path1 = Paths.get("home/adrian");
//        Path path2 = Paths.get("test/arquivo.txt");
//        Path resolve = path1.resolve(path2);
//        System.out.println(resolve);

        Path absolute = Paths.get("/home/adrian");
        Path relative = Paths.get("teste");
        Path file = Paths.get("text.txt");

        System.out.println("1 " + absolute.resolve(relative)); // Certo
        System.out.println("2 " + absolute.resolve(file)); // Certo

        System.out.println("3 " + relative.resolve(absolute)); // Resolução em absoluto
        System.out.println("4 " + relative.resolve(file)); // Certo

        System.out.println("5 " + file.resolve(absolute)); // Resolução em absoluto
        System.out.println("6 " + file.resolve(relative)); // Certo
    }
}
