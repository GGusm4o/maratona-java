package academy.maratonajava.poo.metodos.domain;

public class Funcionario {
    public String name;
    public int age;
    public double[] salaries;

    public void imprimirDados() {
        System.out.print("Nome: "+this.name);
        System.out.print("\nIdade: "+this.age);
        System.out.print("\nSalario: ");
        if (this.salaries == null) {
            return;
        }
            for (double salary : this.salaries) {
                System.out.print(salary + " ");
            }
            imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (this.salaries == null) {
            return;
        }
        double average = 0;
            for (double salary : this.salaries) {
                average += salary;
            }
            average /= salaries.length;

        System.out.print("\nMédia Salarial: "+average);
    }
}
