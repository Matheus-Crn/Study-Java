package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteImprime {
    public void imprime(Estudante estudante) {
        estudante.nome = "gohan";
        estudante.idade = 12;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
