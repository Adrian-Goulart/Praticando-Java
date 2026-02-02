package praticandoJava.aula.Inio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path directoryPath = Paths.get("pasta");
        if (Files.notExists(directoryPath)) {
            Path createDirectory = Files.createDirectory(directoryPath);
        }

        Path directoriesPath = Paths.get("pasta", "subpasta");
        Path createDirectories = Files.createDirectories(directoriesPath);

        Path filePath = Paths.get(directoriesPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path createFile = Files.createFile(filePath);
        }

        Path source = filePath; // Origem
        Path target = Paths.get(filePath.getParent().toString(), "file_copied.txt"); // Destino que vai ser copiado
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
