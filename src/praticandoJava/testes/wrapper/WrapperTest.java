package praticandoJava.testes.wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        Character character = 'H';

        // Verificação de Letra
        System.out.println("É letra? " + Character.isLetter(character));

        // Verificação de Dígito
        System.out.println("É digito? " + Character.isDigit(character));

        // Verificação de Letra ou Digito
        System.out.println("É letra OU digito? " + Character.isLetterOrDigit(character));

        // Verificação de Minúscula
        System.out.println("É minúscula? " + Character.isLowerCase(character));

        // Verificação de Maiúscula
        System.out.println("É maiúscula? " + Character.isUpperCase(character));

        // INTEGER
        System.out.println("INTEGER");
        Integer integer = 2147483647;

    }
}
