package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media ;
//    public double salario[];

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.println(salario + " ");

        }
        imprimeMediaSalario();
    }

    //aconselhavel fazer em outra classe
    public void imprimeMediaSalario() {

        if (salarios == null) {
            return;
        }


        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nmedia: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }



/*  public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Matheus";
        funcionario.idade = 20;
        System.out.println("Olá, meu nome é "+funcionario.nome+", tenho "+funcionario.idade+" anos");
        System.out.println("Como dev jr, eu recebia R$"+ funcionario.salario[0]+"0, como pleno R$"+funcionario.salario[1]+"0 e como senior R$"+funcionario.salario[2]+"0");

        int soma = 0;
        for (int i = 0; i < funcionario.salario.length; i++) {
            soma += funcionario.salario[i];
        }
        double media = (double) soma / funcionario.salario.length;
        System.out.println("A média é: " + media);
*/


}
