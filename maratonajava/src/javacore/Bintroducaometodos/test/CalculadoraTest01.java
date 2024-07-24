package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {  // método void retorna apenas uma saida no console de resultado e não para usuário
        Calculadora calculadora = new Calculadora();
        calculadora.somaDeDoisNumeros();
        System.out.println("-------------------------------");
        calculadora.subtraiDeDoisNumeros();
        System.out.println("-------------------------------");
        calculadora.multiplicaDeDoisNumeros(10, 4);
    }
}
