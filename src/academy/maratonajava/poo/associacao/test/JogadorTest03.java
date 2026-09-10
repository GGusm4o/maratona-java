package academy.maratonajava.poo.associacao.test;

import academy.maratonajava.poo.associacao.domain.Jogador;
import academy.maratonajava.poo.associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = new Jogador[]{jogador,  jogador2};

        jogador.setTeam(time);
        jogador2.setTeam(time);
        time.setPlayers(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Tme ---");

        time.imprime();
    }
}
