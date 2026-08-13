package academy.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // byte, short, int, long, float, double, char, boolean
        // Tipo primitivo nome = valor do tipo primitivo; para inicializar uma variavel
        int age = 18;
        long bigNumber = 100000L;
        double salaryDouble = 2000.0D; // Funciona, mas o 'D' é redundante.
        float salaryFloat = 2500.0F; // Para o valor float 'f' ou 'F' avisa que esse número é um float, recomendado ser 'F'
        byte ageByte = -128;
        short ageShort = 10;
        boolean trueValue = true;
        boolean falseValue = false;
        char character = '\u0041'; // Só aceita uma letra, que pode maiúscula 'A' ou minúscula 'a'

        String name = "Maratona";

        System.out.println("A idade é "+age+ " anos");
        System.out.println(falseValue);
        System.out.println(character);
        System.out.println("Hi, my name is "+name);
    }
}