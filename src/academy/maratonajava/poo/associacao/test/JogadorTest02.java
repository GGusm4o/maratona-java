package academy.maratonajava.poo.associacao.test;

import academy.maratonajava.poo.associacao.domain.Jogador;
import academy.maratonajava.poo.associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTeam(time);
        jogador1.imprime();

    }
}
