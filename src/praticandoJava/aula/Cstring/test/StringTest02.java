package praticandoJava.aula.Cstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome1 = "      Killua              ";
        String nums = "0123456789";

        System.out.println(nome1.charAt(0));
        System.out.println(nome1.length());
        System.out.println(nome1.replace("l", "u"));
        System.out.println(nome1.toLowerCase());
        System.out.println(nome1.toUpperCase());
        System.out.println(nums.substring(2, 7));
        System.out.println(nome1.trim());
    }
}