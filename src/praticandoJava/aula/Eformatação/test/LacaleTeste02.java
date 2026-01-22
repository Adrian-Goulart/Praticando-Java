package praticandoJava.aula.Eformatação.test;

import java.util.Locale;

public class LacaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry + " ");
        }
        System.out.println();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage + " ");
        }
    }
}
