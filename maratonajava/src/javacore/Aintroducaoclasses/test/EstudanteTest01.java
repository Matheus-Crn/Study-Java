package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        // Uma variável de referência "professor" para o objeto Estudante
        estudante.nome = "Elias";
        estudante.idade = 27;
        estudante.sexo = "Masculino";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);  // Irá imprimir apenas o valor em espaço da memória
    }
}
