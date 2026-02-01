package praticandoJava.aula.Hio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("pasta");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println(isDirectoryCreated);

        File archive = new File(directory, "arquivo.txt");
        boolean isArchiveCreated = archive.createNewFile();
        System.out.println(isArchiveCreated);

        File renamedArchive = new File(directory, "arquivo-renomeado");
        boolean isArchieveRenamed = archive.renameTo(renamedArchive);
        System.out.println(isArchieveRenamed);

        File renamedDirectory = new File("pasta-renomeada");
        boolean isDirectoryRenamed = directory.renameTo(renamedDirectory);
        System.out.println(isDirectoryRenamed);
    }
}
