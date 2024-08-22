package javacore.Npolimorfismo.Servico;

import javacore.Npolimorfismo.Dominio.Computador;
import javacore.Npolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("\nRelatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println(imposto);
        System.out.println("-----------------------------------------------------");
    }
    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("\nRelatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println(imposto);
        System.out.println("-----------------------------------------------------");
    }
}
