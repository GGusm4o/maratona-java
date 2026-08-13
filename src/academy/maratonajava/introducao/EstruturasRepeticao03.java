package academy.maratonajava.introducao;

public class EstruturasRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor
    // Exemplo: 50
    public static void main(String[] args) {
        int maxNumber = 50;
        for (int i = 0; i <= maxNumber; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("i = "+i);
        }
    }
}
