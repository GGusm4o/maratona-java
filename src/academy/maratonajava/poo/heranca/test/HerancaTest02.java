package academy.maratonajava.poo.heranca.test;

import academy.maratonajava.poo.heranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de incialização estático da superclasse é executado quando a JVM carregar a superclasse
    // 1 - Bloco de incialização estático da superclasse é executado quando a JVM carregar a subclasse
    // 2 - Alocado espaco em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado da superclasse
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparace
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaco em memória pro objeto da subclasse
    // 7 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado da subclasse
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparace
    // 9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
