package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        estudante1.nome ="Silva";
        System.out.println(estudante.nome);
        System.out.println("-----------------------------");
        System.out.println(estudante1.nome);
    }
}
