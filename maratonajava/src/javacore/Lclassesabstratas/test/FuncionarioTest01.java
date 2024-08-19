package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Funcionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01  {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", 4000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Matheus", 4000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
