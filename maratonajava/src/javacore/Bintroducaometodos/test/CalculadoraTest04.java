package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 20;
        int b = 30;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("dentro do calculadora: ");
        System.out.println("num1" + a);
        System.out.println("num2" + b);
    }
}
