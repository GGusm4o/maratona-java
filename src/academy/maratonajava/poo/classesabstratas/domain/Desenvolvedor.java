package academy.maratonajava.poo.classesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calcularBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public void imprime() {
        System.out.println("Desenvolvedor");
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
