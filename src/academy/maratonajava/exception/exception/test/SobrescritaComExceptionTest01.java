package academy.maratonajava.exception.exception.test;

import academy.maratonajava.exception.exception.domain.Funcionario;
import academy.maratonajava.exception.exception.domain.LoginInvalidoException;
import academy.maratonajava.exception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
