package academy.maratonajava.poo.introducaoaclasses.test;

import academy.maratonajava.poo.introducaoaclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name = "Sanji";

        System.out.println(estudante2.age);
        System.out.println(estudante2.gender);
        System.out.println(estudante2.name);
        System.out.println("------------------------------");
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println(estudante.name);
    }
}
