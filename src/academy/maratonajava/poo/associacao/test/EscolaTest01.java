package academy.maratonajava.poo.associacao.test;

import academy.maratonajava.poo.associacao.domain.Escola;
import academy.maratonajava.poo.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("FB", professores);

        escola.imprime();
    }
}
