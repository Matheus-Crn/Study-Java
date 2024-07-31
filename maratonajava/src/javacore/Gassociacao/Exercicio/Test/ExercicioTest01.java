package javacore.Gassociacao.Exercicio.Test;

import javacore.Gassociacao.Exercicio.Aluno;
import javacore.Gassociacao.Exercicio.Local;
import javacore.Gassociacao.Exercicio.Professor;
import javacore.Gassociacao.Exercicio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("João Pessoa");
        Aluno aluno = new Aluno("Matheus", 24);
        Aluno aluno1 = new Aluno("Pele", 34);
        Professor professor = new Professor("Matias", "Matematica");
        Aluno[] alunos = {aluno,aluno1}; // porque é um array eu tenho que declarar as posições
        Seminario seminario = new Seminario("Software Development", local, alunos);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
