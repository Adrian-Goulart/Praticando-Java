package praticandoJava.aula.Bwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 10;
        int intP = 100;
        long longP = 1000L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'A';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 32767;
        Integer intW = 2147483647;
        Long longW = 9223372036854775807L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'A';
        Boolean booleanW = true;

        Integer integer = Integer.parseInt("234");
        System.out.println(integer);

    }
}