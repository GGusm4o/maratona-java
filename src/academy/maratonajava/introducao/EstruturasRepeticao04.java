package academy.maratonajava.introducao;

public class EstruturasRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double totalPrice = 30000D;
        for (int monthCount = 1; monthCount <= totalPrice; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                break;
            }
            System.out.println("Parcela " + monthCount+": R$ "+ monthlyPrice);
        }
    }
}
