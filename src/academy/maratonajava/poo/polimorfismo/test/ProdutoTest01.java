package academy.maratonajava.poo.polimorfismo.test;

import academy.maratonajava.poo.polimorfismo.domain.Computador;
import academy.maratonajava.poo.polimorfismo.domain.Televisao;
import academy.maratonajava.poo.polimorfismo.domain.Tomate;
import academy.maratonajava.poo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10-I7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Smart TV Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
