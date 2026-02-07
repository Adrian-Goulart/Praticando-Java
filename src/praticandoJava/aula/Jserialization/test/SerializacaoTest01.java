package praticandoJava.aula.Jserialization.test;

import praticandoJava.aula.Jserialization.dominio.Student;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Student student = new Student(01, "Adrian", "senha-Secreta");
        serializer(student);
        deserializer();
    }

    private static void serializer(Student student) {
        // Path path = Paths.get("Student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.ser"))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.ser"))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
