package academy.maratonajava.poo.blocosinicializacao.test;

import academy.maratonajava.poo.blocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
