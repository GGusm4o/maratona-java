package academy.maratonajava.poo.classesabstratas.domain;

public abstract class Funcionario {
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}