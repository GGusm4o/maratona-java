package academy.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Os operadores ternarios são:
        // ? :

        // Doar se salary > 5000
        double salary = 3000D;
        //  String shouldBuyMessage = "Eu vou doar 500";
        //  String shouldNotBuyMessage = "Ainda não tenho condições, mas vou ter!";
        // String displayMessage = (condicao) ? true : false
        String displayMessage = salary > 5000 ? "Eu vou doar 500" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(displayMessage);


        //  if (age < 15) {
        //      category = "Categoria Infantil";
        // } else if (age >= 15 && age < 18) {
        //      category = "Categoria Juvenil";
        // } else {
        //      category = "Categoria Adulto";
        // }
        int age = 45;
        String category = age < 15 ? "Categoria Infantil" : age >= 15 && age < 18 ? "Categoria Juvenil" : "Categoria Adulto";
    }
}
