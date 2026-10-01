package academy.maratonajava.poo.polimorfismo.test;

import academy.maratonajava.poo.polimorfismo.domain.Computador;
import academy.maratonajava.poo.polimorfismo.domain.Produto;
import academy.maratonajava.poo.polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7", 3000);
        System.out.println(produto.getName());
        System.out.println(produto.getPrice());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------------------");

        Produto produto2 = new Tomate("Cereja", 20);
        System.out.println(produto2.getName());
        System.out.println(produto2.getPrice());
        System.out.println(produto2.calcularImposto());
    }
}
