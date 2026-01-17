package praticandoJava.aula.Aexception.test;

import praticandoJava.aula.Aexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String nomeDB = "Killua";
        String senhaDB = "Zoldyck123";

        System.out.println("Nome:");
        String nomeDigitado = sc.nextLine();
        System.out.println("Senha:");
        String senhaDigitada = sc.nextLine();

        if (!nomeDigitado.equals(nomeDB) || !senhaDigitada.equals(senhaDB)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
    }
}
