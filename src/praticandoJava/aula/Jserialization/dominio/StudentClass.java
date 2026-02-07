package praticandoJava.aula.Jserialization.dominio;

import java.io.Serializable;

public class StudentClass {
    String name;

    public StudentClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
