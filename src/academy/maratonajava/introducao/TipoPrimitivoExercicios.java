package academy.maratonajava.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/
public class TipoPrimitivoExercicios {
    public static void main(String[] args) {
        String name = "Gui";
        String address = "Av. ABC";
        double salary = 2500.0D;
        // dd/MM/yyyy
        String receivedDate = "11/09/2026";
        String report = "Eu "+name+ " morando no endereço "+address+ " confirmo que recebi o salário de "+salary+ " na data "+ receivedDate;

        System.out.println(report);
    }
}
