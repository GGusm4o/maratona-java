package academy.maratonajava.poo.metodos.test;

import academy.maratonajava.poo.metodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numbers = {1, 2, 3, 4, 5};
        calculadora.sumArray(numbers);
        calculadora.sumVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
