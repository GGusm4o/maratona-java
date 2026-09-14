package academy.maratonajava.poo.associacao.domain;

import java.util.Arrays;

public class Professor {
    private String name;
    private String researchField;
    private Seminario[] seminario;

    public Professor(String name) {
        this.name = name;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public Professor(String name, String researchField, Seminario[] seminario) {
        this.name = name;
        this.researchField = researchField;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("--- Professor ---");
        System.out.println("Nome: " + this.name);

        if (this.seminario == null) return;
        System.out.println("## Seminario cadastrados ##");

        for (Seminario seminario : this.seminario) {
            System.out.println(seminario.getTitle());
            System.out.println(seminario.getLocal().getAddress());
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getName()+ "\n" + "Idade: " + aluno.getAge());
            }
        }
        System.out.println("--------------------");
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
