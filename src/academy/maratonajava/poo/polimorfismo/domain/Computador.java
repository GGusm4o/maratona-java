package academy.maratonajava.poo.polimorfismo.domain;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador...");
        return this.price * IMPOSTO_POR_CENTO;
    }


}
