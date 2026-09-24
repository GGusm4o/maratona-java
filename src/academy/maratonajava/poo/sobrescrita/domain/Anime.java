package academy.maratonajava.poo.sobrescrita.domain;

public class Anime extends Object {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}