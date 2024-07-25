package javacore.Fmodificadorstatic.Domain;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; // O Static definido como um metadado padrão da classe principal. Será aplicado em tudo.

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){
        System.out.println("-----------");
        System.out.println("Nome do carro: " + this.marca);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
