package academy.maratonajava.poo.polimorfismo.servico;

import academy.maratonajava.poo.polimorfismo.domain.Produto;
import academy.maratonajava.poo.polimorfismo.domain.Tomate;


public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getName());
        System.out.println("Valor: " +produto.getPrice());
        System.out.println("Imposto a ser pago: " +imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
