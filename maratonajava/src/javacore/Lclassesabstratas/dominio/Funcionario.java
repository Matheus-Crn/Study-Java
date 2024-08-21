package javacore.Lclassesabstratas.dominio;

public abstract class  Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();

    }
    // metodo abstract não tem corpo, ele é definido aonde é chamado.
    public  abstract void calculaBonus();

    @Override
    // Trazendo metodo abstract de outra classe abstract que ja vai ser estendido para as demais classes com o extends de Funcionario
    public void imprime() {
        System.out.println("imprimindo");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

