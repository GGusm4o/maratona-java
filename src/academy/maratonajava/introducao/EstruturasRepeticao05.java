package academy.maratonajava.introducao;

public class EstruturasRepeticao05 {
    public static void main(String[] args) {
        double totalPrice = 30000D;
        for (int monthCount = (int) totalPrice; monthCount >= 1; monthCount--) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                continue;
            }
            System.out.println("Parcela " + monthCount+": R$ "+ monthlyPrice);
        }
    }
}
