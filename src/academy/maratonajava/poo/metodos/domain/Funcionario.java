package academy.maratonajava.poo.metodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void imprimirDados() {
        System.out.print("Nome: "+this.name);
        System.out.print("\nIdade: "+this.age);
        System.out.print("\nSalario: ");
        if (this.salaries == null) {
            return;
        }
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
            imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (this.salaries == null) {
            return;
        }
            for (double salary : salaries) {
                average += salary;
            }
            average /= salaries.length;

        System.out.print("\nMédia Salarial: "+average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }
}
