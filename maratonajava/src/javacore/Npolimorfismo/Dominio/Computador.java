package javacore.Npolimorfismo.Dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_EM_PORCENTAGEM_COMPUTADOR = 0.21; // variavel referente ao valor do imposto
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() { // metodo para definir o valor do imposto referente ao computador
        System.out.print("O valor descontado referente ao ");
        return this.valor * IMPOSTO_EM_PORCENTAGEM_COMPUTADOR;
    }
}
