package praticandoJava.aula.Hio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/adrian/Testes/Pasta3/ArquivosP3");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Criado: " + isCreated);
            System.out.println("Caminho: " + file.getPath());
            System.out.println("Caminho Absoluto: " + file.getAbsoluteFile());
            System.out.println("Oculto: " + file.isHidden());
            System.out.println("Arquivo: " + file.isFile());
            System.out.println("Diretório: " + file.isDirectory());
            System.out.println("Modificado: " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deletado: " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
