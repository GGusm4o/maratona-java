package academy.maratonajava.poo.metodos.test;

import academy.maratonajava.poo.metodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Akita");
        pessoa.setAge(45);
        pessoa.imprime();

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());

    }
}
