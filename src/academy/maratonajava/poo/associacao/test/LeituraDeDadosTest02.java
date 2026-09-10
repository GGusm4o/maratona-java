package academy.maratonajava.poo.associacao.test;

import java.util.Scanner;

public class LeituraDeDadosTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite a sua pergunta e eu lhe respoderei sim ou não");
        System.out.print("PERGUTE: ");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}