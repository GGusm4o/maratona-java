package academy.maratonajava.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Exercicio de IF, ELSE IF, ELSE

        double annualSalary = 70000D;
        double firstBracket = 9.70 / 100;
        double SecondBracket = 37.35 / 100;
        double thirdBracket = 49.50 / 100;
        double amountToBePaid;
        if (annualSalary <= 34712) {
            amountToBePaid = annualSalary * firstBracket;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            amountToBePaid = annualSalary * SecondBracket;
        } else {
            amountToBePaid = annualSalary * thirdBracket;
        }
        System.out.println("Valor do imposto: " + amountToBePaid);
    }
}
