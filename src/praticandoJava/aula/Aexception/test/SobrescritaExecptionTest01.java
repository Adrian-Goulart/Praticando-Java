package praticandoJava.aula.Aexception.test;

import praticandoJava.aula.Aexception.dominio.Funcionario;
import praticandoJava.aula.Aexception.dominio.LoginInvalidoException;
import praticandoJava.aula.Aexception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExecptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
