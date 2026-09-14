package academy.maratonajava.poo.associacao.test;

import academy.maratonajava.poo.associacao.domain.Aluno;
import academy.maratonajava.poo.associacao.domain.Local;
import academy.maratonajava.poo.associacao.domain.Professor;
import academy.maratonajava.poo.associacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Neves");
        Aluno aluno = new Aluno("Luffy", 19);
        Professor professor = new Professor("Barba Branca", "Pirata");

        Aluno[] alunos = {aluno};

        Seminario seminario = new Seminario("Onde acha o One Piece", alunos, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminario(seminariosDisponiveis);

        professor.imprime();
    }
}
