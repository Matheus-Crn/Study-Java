package javacore.Npolimorfismo.Dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_EM_PORCENTAGEM_COMPUTADOR = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.print("O valor descontado referente ao imposto será de: ");
        return this.valor * IMPOSTO_EM_PORCENTAGEM_COMPUTADOR;
    }
}
