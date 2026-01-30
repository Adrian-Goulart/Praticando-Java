package praticandoJava.aula.FresourcesBundle.Test;

import java.time.ZoneId;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }
}

// Locale("ja", "JP");
// messages_ja_JP.properties
// messages_ja.properties
// messages_pt_BR.properties
// messages_pt.properties
// messages.properties