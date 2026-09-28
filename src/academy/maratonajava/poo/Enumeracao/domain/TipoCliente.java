package academy.maratonajava.poo.Enumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2,  "Pessoa Juridica");

    // public final int VALUE;
    private int value;
    private String nomeRelatorio;
    TipoCliente(int value, String nomeRelatorio) {
        this.value = value;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValue() {
        return value;
    }
}
