package academy.maratonajava.poo.polimorfismo.test;

import academy.maratonajava.poo.polimorfismo.repositorio.Repositorio;
import academy.maratonajava.poo.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
