package academy.maratonajava.poo.heranca.domain;

public class Funcionario extends Pessoa {
    private double salary;

    public Funcionario(String name) {
        super(name);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: "+this.salary);
    }

    public void relatorio () {
        System.out.println("Eu "+ this.name+" recebi o salario de "+this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
