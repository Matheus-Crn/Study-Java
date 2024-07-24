package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

import java.math.BigDecimal;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        BigDecimal valorBigDecimal = new BigDecimal("80.000");
        Carro carro1 = new Carro();
        BigDecimal valor = new BigDecimal("100.000");


        carro.marca = "Ford";
        carro.modelo = "Eco Sport";
        carro.cor = "Branca";
        carro.ano = 2015;

        carro1.marca = "Honda";
        carro1.modelo = "Hrv";
        carro1.cor = "Branca";
        carro1.ano = 2020;



        System.out.println("Temos um carro da marca "+carro.marca+" modelo "+carro.modelo+" na cor "+carro.cor+" ano "+carro.ano+" valor de R$"+valorBigDecimal+",00 reais");

        System.out.println("-------------------------");

        System.out.println("Temos um carro da marca "+carro1.marca+" modelo "+carro1.modelo+" na cor "+carro1.cor+" ano "+carro1.ano+" no valor de R$"+valor+",00 reais.");

    }
}
