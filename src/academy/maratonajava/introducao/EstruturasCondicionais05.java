package academy.maratonajava.introducao;

public class EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Esse é uma Estrutura Condicional parecida com controle de fluxo
        // Esse é chamada de Switch

        // Problema: IMPRIMA O DIA DA SEMANA CONSIDERANDO 1 COMO DOMIGO
        byte day = 1;
        // Switch é uma palavra reservada e tem  algumas exeções
        // Como char, int, byte, short, enum, String
        switch (day){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        char gender = 'M';
        switch (gender){
            case 'M':
            System.out.println("HOMEN");
            break;
            case 'F':
                System.out.println("MULHER");
                break;
            default:
                System.out.println("OPCAO INVALIDA");
                break;
        }

    }
}
