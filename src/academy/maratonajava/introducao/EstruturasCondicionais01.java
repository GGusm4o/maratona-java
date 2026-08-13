package academy.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        // As Estruturas Condicionais são:
        // IF, ELSE e ELSE IF

        // Aqui é só IF e ELSE

        int age = 15;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        // Operador de negação: !
        if (!isAllowedToBuyAlcohol) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do IF");
    }
}
