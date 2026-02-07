package praticandoJava.aula.Jserialization.dominio;

import java.io.*;

public class Student implements Serializable {
    private int id;
    private String name;
    private transient String password;
    transient StudentClass studentClass;

    public Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", student class='" + studentClass + '\'' +
                '}';
    }
    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            // Primeiro, forma padão
            oos.defaultWriteObject();
            // O que não faz parte, pegar atributos
            oos.writeUTF(studentClass.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String className = ois.readUTF();
            studentClass = new StudentClass(className);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
