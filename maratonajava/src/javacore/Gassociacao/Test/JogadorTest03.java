package javacore.Gassociacao.Test;

import javacore.Gassociacao.Dominio.Jogador;
import javacore.Gassociacao.Dominio.Time;

import java.util.SortedMap;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador, jogador1}; // Declarando o Array e sua posição em memória e sua variável de referência.

        jogador.setTime(time);
        jogador1.setTime(time);
        time.setJogadores(jogadores); // setJogadores se refere ao set na classe Jogador
        // (jogadores) se refere a variável de referência do array.

        System.out.println("--Jogador--");
       // System.out.println(jogador.getNome()); ---> Dessa forma também imprime o valor atribuído ao jogador.
        jogador.imprime(); // assim eu pucho o objeto com a variável de referência com o método IMPRIME da classe de Jogador
        jogador1.imprime(); // assim eu pucho o objeto com a variável de referência com o método IMPRIME da classe de Jogador


        System.out.println("--Time--");

        time.imprime(); // Da mesma forma que o de cima, obtendo os dados.
    }
}
