package academy.maratonajava.poo.polimorfismo.servico;

import academy.maratonajava.poo.polimorfismo.domain.Computador;
import academy.maratonajava.poo.polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " +computador.getName());
        System.out.println("Valor: " +computador.getPrice());
        System.out.println("Imposto a ser pago: " +imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " +tomate.getName());
        System.out.println("Valor: " +tomate.getPrice());
        System.out.println("Imposto a ser pago: " +imposto);
    }
}
