package javacore.Fmodificadorstatic.Dominio;

public class Anime {
    private String nome;
    private static int[] epsodios;

    // 0- bloco de inicialização é executado quando a jvm carregar a classe
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default, null e false
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    // com o static ele vai carregar apenas uma vez
    static {
        System.out.println("Bloco de inicialização--");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) { // Aqui faz a contagem em espaço de memoria
            epsodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Bloco de inicialização 2 sendo executado em ordem de linhas de códigos");
    }
    {
        System.out.println("Bloco de inicialização sem o static, mas posso ter na classe também.");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int epsodio : Anime.epsodios) { // Serve para imprimir o array, usa o for
            System.out.print(epsodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
