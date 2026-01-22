package praticandoJava.aula.Eformatação.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "br");
        Locale localeJapan = new Locale("ja", "jp");

        Calendar calendar = Calendar.getInstance();
        DateFormat dfBrazil = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        System.out.println("Brasil: " + dfBrazil.format(calendar.getTime()));
        System.out.println("Japão: " + dfJapan.format(calendar.getTime()));
    }
}
