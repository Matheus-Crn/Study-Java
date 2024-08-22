package javacore.Npolimorfismo.Dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_EM_PORCENTAGEM_TOMATE = 0.12; // variavel referente ao valor do imposto
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() { // metodo para definir o valor do imposto referente ao tomate
        System.out.print("O valor descontado referente ao imposto será de: ");
        return this.valor * IMPOSTO_EM_PORCENTAGEM_TOMATE;
    }
}
