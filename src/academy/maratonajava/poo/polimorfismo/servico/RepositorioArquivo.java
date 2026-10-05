package academy.maratonajava.poo.polimorfismo.servico;

import academy.maratonajava.poo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
