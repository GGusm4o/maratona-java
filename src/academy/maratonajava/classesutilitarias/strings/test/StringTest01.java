package academy.maratonajava.classesutilitarias.strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "GGusm4o"; // String constant pool
        String nome2 = "GGusm4o";
        nome = nome.concat(" Ev."); // nome += " Ev."
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("GGusm4o"); // 1 variavel de referência, 2 obj. do tipo String, 3 uma String no pool string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
