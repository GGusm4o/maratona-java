package academy.maratonajava.poo.metodos.test;

import academy.maratonajava.poo.metodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Sanji");
        funcionario.setAge(23);
        funcionario.setSalaries(new double[]{1200, 987.32, 2000});

        funcionario.imprimirDados();
    }
}
