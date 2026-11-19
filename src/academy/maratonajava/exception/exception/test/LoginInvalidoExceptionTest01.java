package academy.maratonajava.exception.exception.test;

import academy.maratonajava.exception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner keyboard = new Scanner(System.in);
        String usernameDB = "GG";
        String passwordDB = "admin123";
        System.out.print("User: ");
        String userTyped = keyboard.nextLine();
        System.out.print("Passaword: ");
        String passwordTyped = keyboard.nextLine();
        if(!usernameDB.equals(userTyped) || !passwordDB.equals(passwordTyped)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
