package academy.maratonajava.excecoes.exception.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
