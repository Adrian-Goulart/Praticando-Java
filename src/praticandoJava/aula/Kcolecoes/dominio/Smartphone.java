package praticandoJava.aula.Kcolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

//    Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
//    Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equal(x) -- true
//    Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z == true)
//    Consistente: x.equals(x) sempre retorna true se x for diferente de null
//    para x diferente de null, x.equals(null) tem que retornar false.

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj ) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return (serialNumber != null && serialNumber.equals(smartphone.serialNumber)) && (brand != null && brand.equals(smartphone.brand));
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
