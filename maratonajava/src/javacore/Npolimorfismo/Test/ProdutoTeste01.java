package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.Dominio.Computador;
import javacore.Npolimorfismo.Dominio.Produto;
import javacore.Npolimorfismo.Dominio.Tomate;
import javacore.Npolimorfismo.Servico.CalculadoraImposto;

import static javacore.Npolimorfismo.Servico.CalculadoraImposto.calcularImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Aspire 5", 3000);
        Tomate tomate = new Tomate("Tomate siciliano", 2.90);
       // CalculadoraImposto.calcularImpostoComputador(computador);
       // CalculadoraImposto.calcularImpostoTomate(tomate);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
    }
}
