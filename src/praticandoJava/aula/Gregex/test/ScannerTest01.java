package praticandoJava.aula.Gregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Frieren, Fern, Stark";
        String[] nomes = texto.split(",");
        
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
