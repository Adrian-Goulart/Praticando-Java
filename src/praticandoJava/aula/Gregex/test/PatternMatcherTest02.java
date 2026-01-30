package praticandoJava.aula.Gregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d --> Todos os dígitos
        // \D --> Tudo o que não é dígito
        // \s --> Espaços em branco (\t \n \f \r são considerados espaços em branco)
        // \S --> Todos menos os espaços em branco
        // \w --> a-z A-Z, dígitos e _
        // \W --> Tudo que não pertence ao \w

        String regex = "\\S";
        String texto = "Stellar Stellar";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()) {
            System.out.println(matcher.start()+ " "+ matcher.group());
        }
    }
}
