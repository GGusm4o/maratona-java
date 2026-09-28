package academy.maratonajava.poo.Enumeracao.domain;

public class Cliente {
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
