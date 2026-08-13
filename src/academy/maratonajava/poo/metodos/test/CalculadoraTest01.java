package academy.maratonajava.poo.metodos.test;

import academy.maratonajava.poo.metodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sumTwoNumbers();
        System.out.println("Finalizando CalculadoraTest01");

        calculadora.subtractTwoNumbers();
    }
}