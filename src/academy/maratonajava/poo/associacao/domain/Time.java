package academy.maratonajava.poo.associacao.domain;

public class Time {
    private String name;
    private Jogador[] players;

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] players) {
        this.name = name;
        this.players = players;
    }

    public void imprime() {
        System.out.println(this.name);
        for (Jogador jogador : this.players) {
            System.out.println(jogador.getName());
        }
    }

    public Jogador[] getPlayers() {
        return players;
    }

    public void setPlayers(Jogador[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
