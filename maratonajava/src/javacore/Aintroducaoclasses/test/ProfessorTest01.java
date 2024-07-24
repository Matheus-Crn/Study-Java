package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "João";
        professor.sexo ="Masculino";
        professor.idade = 40;

        // Como imprimir tudo em uma única linha usando a concatenação ++++++
        System.out.println(professor.nome + " é o professor da escola, ele tem "+professor.idade+" anos. Provavelmente ele é "+professor.sexo);
    }
}
