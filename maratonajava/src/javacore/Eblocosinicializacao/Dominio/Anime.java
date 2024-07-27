package javacore.Eblocosinicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] epsodios;

    {
        System.out.println("Bloco de inicialização");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) { // Aqui faz a contagem em espaço de memoria
            epsodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int epsodio : this.epsodios) { // Serve para imprimir o array, usa o for
            System.out.println(epsodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
