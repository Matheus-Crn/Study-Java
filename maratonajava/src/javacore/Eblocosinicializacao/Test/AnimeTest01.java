package javacore.Eblocosinicializacao.Test;

import javacore.Eblocosinicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("On piece");

        for (int episodio : anime.getEpsodios()) {
            System.out.println(episodio+ "");
        }
    }
}
