package academy.maratonajava.introducao;

public class TiposPrimitivosCasting {
    public static void main(String[] args) {
        // byte, short, int, long, float, double, char, boolean
        // Tipo primitivo nome = valor do tipo primitivo; para inicializar uma variavel
        int age = (int) 10000000000L; //converte int para long. int -> long
        long bigNumber = (long) 155.23; // converte long para double. long -> double
        double salaryDouble = 2000.0D; // Funciona, mas o 'D' é redundante.

        // Para o valor float 'f' ou 'F' avisa que esse número é um float, recomendado ser 'F'
        float salaryFloat = (float) 2500.0D; // Converte float para double. float -> double
        byte ageByte = 127;
        short ageShort = 32000;
        boolean trueValue = true;
        boolean falseValue = false;
        char character = '\u0041'; // Só aceita uma letra, que pode maiúscula 'A' ou minúscula 'a'

        System.out.println("A idade é "+age+ " anos");
        System.out.println(falseValue);
        System.out.println(age);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
    }
}
