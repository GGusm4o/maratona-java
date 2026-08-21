package academy.maratonajava.poo.metodos.domain;

public class Estudante {
    public String name = "Zoro";
    public int age;
    public char gender;
    public void imprime() {
        System.out.println("-------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
