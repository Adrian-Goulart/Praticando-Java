package praticandoJava.aula.Kcolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A Silent Voice", "Koe no Katachi");
        map.put("Call of the Night", "Yofukashi no Uta");
        map.put("The Apothecary Diaries", "Kusuriya no Hitorigoto");
        map.put("Frieren: Beyond Journey’s End", "Sousou no Frieren");
        map.putIfAbsent("A Silent Voice", "Koe no Katachi");
        System.out.println(map);

        for (String key : map.keySet()) {
            // Podemos pegar tanto a chave quanto valor
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("-----------------");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("-----------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
