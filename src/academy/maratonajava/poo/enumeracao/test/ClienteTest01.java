package academy.maratonajava.poo.enumeracao.test;

import academy.maratonajava.poo.enumeracao.domain.Cliente;
import academy.maratonajava.poo.enumeracao.domain.TipoCliente;
import academy.maratonajava.poo.enumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("GG", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100) + " %");
        TipoCliente tipoCliente= TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.getByReportValue("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
