package praticandoJava.aula.Kcolecoes.test;

import java.util.Objects;

public class Manga {
    private Long id;
    private String name;
    private double priece;

    public Manga(Long id, String name, double priece) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
        this.priece = priece;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(priece, manga.priece) == 0 && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, priece);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priece=" + priece +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriece() {
        return priece;
    }

    public void setPriece(double priece) {
        this.priece = priece;
    }
}
