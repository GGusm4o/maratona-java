package academy.maratonajava.exception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("\nCódigo finalizado");
    }

    /**
     *
     * @param a
     * @param b Não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento Ilegal, não pode ser 0");
        }
        return a / b;
    }
}
