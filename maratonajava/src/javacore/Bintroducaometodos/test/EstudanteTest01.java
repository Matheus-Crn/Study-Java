package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        EstudanteImprime estudanteImprime = new EstudanteImprime(); // Chamando o metodo estudanteImprime

        estudante01.nome = "goku";
        estudante01.idade = 32;
        estudante01.sexo = 'M';

        estudante02.nome = "Videl";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        System.out.println("\n"+estudante01.nome); // vai ser usado a variavel local
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("----------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        System.out.println("---------------");
        estudanteImprime.imprime(estudante01); // Vai ser usado a variavel e valor contido no metodo
        System.out.println("---------------");
        estudanteImprime.imprime(estudante02);
        System.out.println("+++++++++++");
        estudanteImprime.imprime(estudante01);
        estudanteImprime.imprime(estudante02);

    }
}
