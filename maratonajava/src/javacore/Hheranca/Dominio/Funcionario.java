package javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa {
    private Double salario;
    static {
        System.out.println("Dentro de um bloco estatico de Funcionario");
    }
    {
        System.out.println("Dentro de um bloco NãO estatico de Funcionario");
    }
    {
        System.out.println("Dentro de um bloco NãO estatico2 de Funcionario");
    }
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
