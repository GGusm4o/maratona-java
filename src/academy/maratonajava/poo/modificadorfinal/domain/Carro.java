package academy.maratonajava.poo.modificadorfinal.domain;

public class Carro {
    private String name;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade: " + this.VELOCIDADE_LIMITE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}