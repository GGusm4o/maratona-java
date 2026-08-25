package academy.maratonajava.poo.metodos.domain;

public class Pessoa {
    private String name;
    private int age;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}