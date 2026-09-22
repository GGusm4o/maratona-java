package academy.maratonajava.poo.heranca.domain;

public class Funcionario extends Pessoa {
    private double salary;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionario 2");
    }

    public Funcionario(String name) {
        super(name);
        System.out.println("Dentro do construtor de Funcionario");
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
