package academy.maratonajava.poo.metodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("----------------------");
        System.out.println(estudante.name);
        System.out.println(estudante.gender);
        System.out.println(estudante.age);

        estudante.name = "Gohan";
    }
}
