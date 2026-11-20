package academy.maratonajava.excecoes.exception.test;

import academy.maratonajava.excecoes.exception.domain.Funcionario;
import academy.maratonajava.excecoes.exception.domain.LoginInvalidoException;
import academy.maratonajava.excecoes.exception.domain.Pessoa;

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
