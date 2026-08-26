package academy.maratonajava.poo.Construtores.test;

import academy.maratonajava.poo.Construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Black Clover", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}