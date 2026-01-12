package praticandoJava.aula.exception.test;

import praticandoJava.aula.exception.dominio.Funcionario;
import praticandoJava.aula.exception.dominio.LoginInvalidoException;
import praticandoJava.aula.exception.dominio.Pessoa;

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
