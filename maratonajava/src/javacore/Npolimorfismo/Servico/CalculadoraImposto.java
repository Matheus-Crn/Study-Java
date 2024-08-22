package javacore.Npolimorfismo.Servico;

import javacore.Npolimorfismo.Dominio.Computador;
import javacore.Npolimorfismo.Dominio.Produto;
import javacore.Npolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    // esses metodos seriam referentes a cada produto, tornando o codigo muito extenso.
   /* public static void calcularImpostoComputador(Computador computador){
        System.out.println("\nRelatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println(imposto);
        System.out.println("-----------------------------------------------------");
    }
    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("\nRelatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println(tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println(imposto + " imposto referente ao preço do tomate");
        System.out.println("-----------------------------------------------------");
    }
*/
    // com esse metodo eu consigo imprimir todos os produtos referente, usando o polimorfismo
    public static void calcularImposto(Produto produto){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Calculando imposto de varios produtos dentro de apenas um método");
        double imposto = produto.calcularImposto();
        System.out.println(produto.getNome()+" com o valor de "+produto.getValor()+ "R$ reais");
        System.out.println("Será de "+imposto+"R$ reais");

    }


}
