package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "\njoão";
        estudante1.idade = 40;
        estudante1.sexo = 'M';

        estudante2.nome = "\nmaria";
        estudante2.idade = 35;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
       /* System.out.println("\n"+estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

        */
    }
}
