package javacore.Jmodificadorfinal.Test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Ferrari;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(  "Velocidade limite do carro é "+ carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Puro sangue 2024");
        ferrari.imprime();
    }
}
