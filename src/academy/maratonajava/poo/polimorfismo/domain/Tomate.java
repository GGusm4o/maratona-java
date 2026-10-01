package academy.maratonajava.poo.polimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;

    private String dataValidade;

    public Tomate(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate...");
        return this.price * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
