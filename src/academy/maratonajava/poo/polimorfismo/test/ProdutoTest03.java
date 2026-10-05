package academy.maratonajava.poo.polimorfismo.test;

import academy.maratonajava.poo.polimorfismo.domain.Computador;
import academy.maratonajava.poo.polimorfismo.domain.Produto;
import academy.maratonajava.poo.polimorfismo.domain.Tomate;
import academy.maratonajava.poo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7", 3000);

        Tomate tomate = new Tomate("Cereja", 20);
        tomate.setDataValidade("10/11/2026");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
