package academy.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        // Para byte, short, int, long, float e double o valor é 0
        // Para char o UNICODE '\u0000' imprime um espaço em branco ' '
        // Para boolean é false
        // Para String é null

        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        names = new String[5];
        System.out.println(names[4]);
    }
}
