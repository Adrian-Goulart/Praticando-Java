package praticandoJava.aula.Eformatação.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "br");
        Locale localeJapan = Locale.JAPAN;
        // Locale localeKorean = Locale.KOREA;

        NumberFormat[] nf = new NumberFormat[3];

        nf[0] = NumberFormat.getInstance(localeBrazil);
        nf[1] = NumberFormat.getInstance(localeJapan);
        nf[2] = NumberFormat.getInstance(Locale.KOREA);

        float value = 3421831.54F;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(value));
        }
    }
}
