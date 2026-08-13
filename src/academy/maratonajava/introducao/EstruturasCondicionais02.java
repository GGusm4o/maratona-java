package academy.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // As Estruturas Condicionais são:
        // IF, ELSE e ELSE IF
        // Aqui é só ELSE IF

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int age = 45;
        String category;

        if (age < 15) {
            category = "Categoria Infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria Juvenil";
        } else {
            category = "Categoria Adulto";
        }
        System.out.println(category);
    }
}
