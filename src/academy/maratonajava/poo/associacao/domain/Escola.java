package academy.maratonajava.poo.associacao.domain;

public class Escola {
    private String name;
    private Professor[] professors;

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void imprime() {
        System.out.println(this.name);
        if (this.professors == null) {
            return;
        }
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
