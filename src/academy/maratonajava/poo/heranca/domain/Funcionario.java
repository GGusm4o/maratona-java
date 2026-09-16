package academy.maratonajava.poo.heranca.domain;

public class Funcionario extends Pessoa {
    private double salary;

    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: "+this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
