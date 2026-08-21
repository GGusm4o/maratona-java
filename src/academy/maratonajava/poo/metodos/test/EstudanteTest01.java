package academy.maratonajava.poo.metodos.test;

import academy.maratonajava.poo.metodos.domain.Estudante;
import academy.maratonajava.poo.metodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Midoriya";
        estudante01.age = 15;
        estudante01.gender = 'M';

        estudante02.name = "Sakura";
        estudante02.age = 16;
        estudante02.gender = 'F';

        System.out.println(estudante01.name);
        System.out.println(estudante01.age);
        System.out.println(estudante01.gender);

        System.out.println("--------------------------------------");

        System.out.println(estudante02.name);
        System.out.println(estudante02.age);
        System.out.println(estudante02.gender);

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("###################################");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
