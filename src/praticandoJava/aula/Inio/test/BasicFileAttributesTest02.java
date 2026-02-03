package praticandoJava.aula.Inio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/subpasta");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation: " + creationTime);
        System.out.println("lastModified: " + lastModifiedTime);
        System.out.println("lastAccess: " + lastAccessTime);

        System.out.println("----------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime,creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation: " + creationTime);
        System.out.println("lastModified: " + lastModifiedTime);
        System.out.println("lastAccess: " + lastAccessTime);
    }
}

//Creation: 2026-02-02T15:01:01.868965933Z
//lastModified: 2026-02-03T19:28:24.976154364Z
//lastAccess: 2026-02-03T19:28:25.623124303Z
//----------------------------------
//Creation: 2026-02-02T15:01:01.868965933Z
//lastModified: 2026-02-03T19:28:24.976154364Z
//lastAccess: 2026-02-03T19:28:25.623124303Z


// fileAttributeView.readAttributes()
//Creation: 2026-02-02T15:01:01.868965933Z
//lastModified: 2026-02-03T19:28:24.976154364Z
//lastAccess: 2026-02-03T20:47:16.959119124Z
//----------------------------------
//Creation: 2026-02-02T15:01:01.868965933Z
//lastModified: 2026-02-03T19:28:24.976154364Z
//lastAccess: 2026-02-03T20:49:14.195Z
