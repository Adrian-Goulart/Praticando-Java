package praticandoJava.aula.Cstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("String finalizado em " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10000);
        fim = System.currentTimeMillis();
        System.out.println("StringBuilder finalizado em " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("StringBuffer finalizado em " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
