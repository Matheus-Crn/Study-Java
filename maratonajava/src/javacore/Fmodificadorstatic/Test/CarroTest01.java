package javacore.Fmodificadorstatic.Test;

import javacore.Fmodificadorstatic.Domain.Carro;


public class CarroTest01 {
    public static void main(String[] args) {
       /* Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);
        carro.imprime();
        carro2.imprime();
        carro3.imprime();

        */
        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);
    }
}
