package academy.maratonajava.poo.introducaoaclasses.test;

import academy.maratonajava.poo.introducaoaclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "GG";
        professor.age = 34;
        professor.gender = 'M';

        System.out.println("Nome: " + professor.name + " Idade: " + professor.age + " Genero: " + professor.gender);
    }
}
