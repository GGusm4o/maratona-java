package academy.maratonajava.poo.polimorfismo.servico;

import academy.maratonajava.poo.polimorfismo.repositorio.Repositorio;

public class ReositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
