package academy.maratonajava.poo.modificadoresestaticos.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Bloco de incialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static { // Bloco de inicialização estśtico
        System.out.println("Dentro do blocos inicialização estático 1");
        episodes = new int[4];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    static { // Bloco de inicialização
        System.out.println("Dentro do blocos inicialização estático 2");
    }

    static { // Bloco de inicialização
        System.out.println("Dentro do blocos inicialização estático 3");
    }

    {
        System.out.println("Dentro do blocos inicialização não estático");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for(int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}