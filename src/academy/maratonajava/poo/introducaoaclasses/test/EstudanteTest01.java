package academy.maratonajava.poo.introducaoaclasses.test;

import academy.maratonajava.poo.introducaoaclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Luffy";
        estudante.age = 21;
        estudante.gender = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println(estudante);
    }
}
