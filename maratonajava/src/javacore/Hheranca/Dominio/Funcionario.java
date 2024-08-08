package javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa {
    private Double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Eu "+ this.nome+ " recebi o sálario de "+this.salario);
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
