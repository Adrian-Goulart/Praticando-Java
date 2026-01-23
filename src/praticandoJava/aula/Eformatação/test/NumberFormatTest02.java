package praticandoJava.aula.Eformatação.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
//        Locale localeBrazil = new Locale("pt", "br");
        Locale localeJapan = Locale.JAPAN;
        NumberFormat[] nf = new NumberFormat[1];

        nf[0] = NumberFormat.getCurrencyInstance(localeJapan);
//        nf[1] = NumberFormat.getCurrencyInstance(Locale.KOREA);
//        nf[2] = NumberFormat.getCurrencyInstance(localeBrazil);

        double value = 1_000.2130;
        for (NumberFormat numberFormat : nf) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
//            System.out.println("Casas: " + numberFormat.getMaximumFractionDigits());
        }

        String stringValue = "￥1000.2130";
        try {
            System.out.println(nf[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}