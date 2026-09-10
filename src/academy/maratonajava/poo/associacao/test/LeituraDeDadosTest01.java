package academy.maratonajava.poo.associacao.test;

import java.util.Scanner;

public class LeituraDeDadosTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = input.nextLine();
        System.out.print("Digite sua idade: ");
        int age = input.nextInt();
        System.out.print("Digite M ou F para seu sexo: ");
        char Gender = input.next().charAt(0);
        System.out.println("-----------------------------");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Sexo: " + Gender);
        System.out.println("----------------------------");
    }
}
