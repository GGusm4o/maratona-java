package academy.maratonajava.poo.construtores.test;

import academy.maratonajava.poo.construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Black Clover", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}