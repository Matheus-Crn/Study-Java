package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
       int idade = 24;
       float salario = 1500;
       boolean idDentroDaLeiMaiorQueVinte = idade >= 20 && salario >= 1500;
       boolean idForaDaLeiMenorQueVinte = idade < 20 && salario < 1500;
        // Usando operadores lógicos para ver o retorno verdadeiro ou falso
        System.out.println("Ele está dentro da lei? "+idDentroDaLeiMaiorQueVinte);
        System.out.println("Ele está fora da lei? "+idForaDaLeiMenorQueVinte);

        System.out.println("------------------------");
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1500;
        float valorPlaystationCinco = 5000;

        // geralmente declaramos o boleando com o is
        boolean isPlaytationCincoCompravel = valorTotalContaCorrente > valorPlaystationCinco || valorTotalContaPoupanca > valorPlaystationCinco;
        System.out.println("Vou poder comprar o play 5? "+isPlaytationCincoCompravel);

        // Operadores atribuição = += -= *= /=
        double bonus = 1800;
        bonus = 2000 + 1000 ;
        System.out.println(bonus);
    }
}
