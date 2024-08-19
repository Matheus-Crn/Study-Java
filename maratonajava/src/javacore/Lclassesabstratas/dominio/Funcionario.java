package javacore.Lclassesabstratas.dominio;

public abstract class  Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();

    }

    // metodo abstract não tem corpo, ele é definido aonde é chamado.
    public  abstract void calculaBonus();

}
