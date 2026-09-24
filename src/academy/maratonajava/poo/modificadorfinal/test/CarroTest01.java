package academy.maratonajava.poo.modificadorfinal.test;

import academy.maratonajava.poo.modificadorfinal.domain.Carro;
import academy.maratonajava.poo.modificadorfinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setName("GG");
        System.out.println(carro.COMPRADOR);

    }
}
