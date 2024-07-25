package javacore.Eblocosinicializacao.Test;

import javacore.Eblocosinicializacao.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("On piece");

        for (int episodio : anime.getEpsodios()) {
            System.out.println(episodio+ "");
        }
    }
}
