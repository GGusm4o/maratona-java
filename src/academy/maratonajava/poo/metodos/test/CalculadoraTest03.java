package academy.maratonajava.poo.metodos.test;

import academy.maratonajava.poo.metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideTwoNumbers(20, 0);
        System.out.println(result);
    }
}
