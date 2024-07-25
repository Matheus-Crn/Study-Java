package javacore.Dconstrutores.Test;

import javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kuma Drive", "tv", 12, "Ação", "Globo"); // aqui eu incluí o conteúdo dentro do construtor
        // Anime anime1 = new Anime(); Ele será impresso, conforme a ordem em linhas no código
        // anime.setNome("Akudama Drive");
        // anime.setTipo("Tv");
        //anime.setEpisodios(12);
        // anime.init("Akudama Driver","TV", 12,"Ação");
        anime.imprime();
    }
}

