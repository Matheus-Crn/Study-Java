package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.Dominio.Computador;
import javacore.Npolimorfismo.Dominio.Produto;
import javacore.Npolimorfismo.Dominio.Tomate;
import javacore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("ACeer", 3000);
        Tomate tomate = new Tomate("Tomate siciliano", 2.90);
        tomate.setDataDeValidade("O "+tomate.getNome()+" tem o prazo de validade para o dia 12/12/2025");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
