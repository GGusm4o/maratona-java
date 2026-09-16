package academy.maratonajava.poo.heranca.test;

import academy.maratonajava.poo.heranca.domain.Endereco;
import academy.maratonajava.poo.heranca.domain.Funcionario;
import academy.maratonajava.poo.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setStreet("Rua J");
        endereco.setZipCode("12345");
        Pessoa pessoa = new Pessoa();
        pessoa.setName("GG");
        pessoa.setCpf("1234567890");
        pessoa.setAddress(endereco);
        pessoa.imprimir();

        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.setName("Joao");
        funcionario.setCpf("1234567890");
        funcionario.setAddress(endereco);
        funcionario.setSalary(10000);
        funcionario.imprimir();
    }
}
