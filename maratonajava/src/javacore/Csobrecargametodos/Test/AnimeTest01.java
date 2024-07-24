package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
       // anime.setNome("Akudama Drive");
        // anime.setTipo("Tv");
        //anime.setEpisodios(12);
        anime.init("Akudama Driver","TV", 12,"Ação" );
        anime.imprime();
    }

}
