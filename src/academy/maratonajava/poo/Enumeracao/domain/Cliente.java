package academy.maratonajava.poo.Enumeracao.domain;

public class Cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValue() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
