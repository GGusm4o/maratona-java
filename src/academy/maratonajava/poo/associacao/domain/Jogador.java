package academy.maratonajava.poo.associacao.domain;

public class Jogador {
    private String name;
    private Time team;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprimir() {
        System.out.println(this.name);
        if (team != null) {
            System.out.println(team.getName());
        }
    }

    public Time getTeam() {
        return team;
    }

    public void setTeam(Time team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
