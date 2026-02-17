package praticandoJava.aula.Kcolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double priece;

    public Manga(Long id, String name, double priece) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(name, "Name não poode ser null");
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

//  Negativo se o `this` < `manga`
//  Se `this` == `manga`, return 0
//  Positivo se `this` > `manga`

    @Override
    public int compareTo(Manga manga) {
//        if (this.id < manga.getId()) {
//            return -1;
//        } else if (this.id.equals(manga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

//        return this.id.compareTo(manga.getId());
//        return this.name.compareTo(manga.name);
        return Double.compare(priece, manga.getPriece());
    }
}
