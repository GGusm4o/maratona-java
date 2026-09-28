package academy.maratonajava.poo.Enumeracao.test;

import academy.maratonajava.poo.Enumeracao.domain.Cliente;
import academy.maratonajava.poo.Enumeracao.domain.TipoCliente;
import academy.maratonajava.poo.Enumeracao.domain.Cliente.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("GG", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
