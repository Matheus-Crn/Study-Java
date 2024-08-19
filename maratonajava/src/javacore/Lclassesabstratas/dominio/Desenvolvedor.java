package javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {  // Necessario um construtor, pois estou extends de uma classe abstract
        super(nome, salario);
    }

    @Override
    public void calculaBonus() { // aqui eu estou atribuindo uma operação ao metodo qu esta em abstrtact na class funcionario
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor- " +
                "nome = " + nome +
                ", salario = " + salario;
    }
}
