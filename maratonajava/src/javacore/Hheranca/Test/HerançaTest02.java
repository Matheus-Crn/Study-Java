package javacore.Hheranca.Test;

import javacore.Hheranca.Dominio.Funcionario;

public class HerançaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe Pai
        // 1 - Bloco de inicialização estático da "subclasse" é executado quando a JVM carregar a classe FILHA
        // 2 - Alocando espaço em mémoria para o objeto da super classe;
        // 3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for passado
        // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
        // 5 - Construtor é executado na super classe
        // 6 - Alocando espaço em mémoria para objeto da super classe
        // 7 - Cada atributo da super classe é criado e inicializado om valores default ou o que for passado
        // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        // 9 - Construtor é executado da subclasse

        Funcionario funcionario = new Funcionario("Zelador");

    }
}

