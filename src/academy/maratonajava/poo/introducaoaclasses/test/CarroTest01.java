package academy.maratonajava.poo.introducaoaclasses.test;

import academy.maratonajava.poo.introducaoaclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Toyota Corolla";
        carro1.model = "Sedan";
        carro1.year = 2023;

        carro2.name = "Fiat Toro";
        carro2.model = "Picape";
        carro2.year = 2025;

        // carro1 = carro2;

        System.out.println("Carro 1: \n" + "Nome: " + carro1.name + "\nModelo: " + carro1.model + "\nAno: " + carro1.year + "\n");
        System.out.println("Carro 2: \n" + "Nome: " + carro2.name + "\nModelo: " + carro2.model + "\nAno: " + carro2.year + "\n");

    }
}