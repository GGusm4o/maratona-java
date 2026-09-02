package academy.maratonajava.poo.modificadoresestaticos.domain;

public class Carro {
    private String name;
    private double valocidadeMaxima;
    private static double valocidadeLimite = 250;

    public Carro(String name, double valocidadeMaxima) {
        this.name = name;
        this.valocidadeMaxima = valocidadeMaxima;
    }

    public void imprime() {
        System.out.println("----------------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade Máxima: " + this.valocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.valocidadeLimite);
    }

    public static void setValocidadeLimite(double valocidadeLimite) {
        Carro.valocidadeLimite = valocidadeLimite;
    }

    public static double getValocidadeLimite() {
        return Carro.valocidadeLimite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValocidadeMaxima() {
        return valocidadeMaxima;
    }

    public void setValocidadeMaxima(double valocidadeMaxima) {
        this.valocidadeMaxima = valocidadeMaxima;
    }
}
