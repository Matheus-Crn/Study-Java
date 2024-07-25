package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("matheus");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1200, 987.30, 2000});

        funcionario.imprime();

    }
}
