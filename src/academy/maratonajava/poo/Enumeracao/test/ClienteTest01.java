package academy.maratonajava.poo.Enumeracao.test;

import academy.maratonajava.poo.Enumeracao.domain.Cliente;
import academy.maratonajava.poo.Enumeracao.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("GG", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("GG", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("GG", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("GG", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
