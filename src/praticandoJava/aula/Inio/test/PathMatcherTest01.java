package praticandoJava.aula.Inio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/text.txt");
        Path path2 = Paths.get("pasta/subpasta/text.md");
        Path path3 = Paths.get("pasta/subpasta/text.bkp");

        matches(path1, "glob:*.txt");
        matches(path1, "glob:**/*.txt"); // Considera Diretórios

        matches(path2, "glob:**/*.txt");
        matches(path2, "glob:**/*.{txt,md,bkp}"); // OU

        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
    }
    public static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
