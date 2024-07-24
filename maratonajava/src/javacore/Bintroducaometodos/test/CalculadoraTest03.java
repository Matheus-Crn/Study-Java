package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDeDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("--------------");

        calculadora.imprimeDeDoisNumeros(20,0);
    }
}
