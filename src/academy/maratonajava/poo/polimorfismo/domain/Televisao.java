package academy.maratonajava.poo.polimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Televisão...");
        return this.price * IMPOSTO_POR_CENTO;
    }


}
