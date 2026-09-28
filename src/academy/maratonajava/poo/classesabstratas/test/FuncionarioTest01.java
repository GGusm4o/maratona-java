package academy.maratonajava.poo.classesabstratas.test;

import academy.maratonajava.poo.classesabstratas.domain.Desenvolvedor;
import academy.maratonajava.poo.classesabstratas.domain.Funcionario;
import academy.maratonajava.poo.classesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente Gerente = new Gerente("GG", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(Gerente);
        System.out.println(desenvolvedor);
    }
}
