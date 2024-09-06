package academy.devdojo.maratonajava.QstringTest;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "matheus";
        String numeros = "012345";

        System.out.println(nome.charAt(0)); // posição de indice
        System.out.println(nome.length()); // numeros de indice
        System.out.println(nome.replace("h", "")); // retira a letra indicada na primeira posição
        System.out.println(nome.toLowerCase()); // tudo letra pequena
        System.out.println(nome.toUpperCase()); // tudo letra grande
        System.out.println(numeros.length()); // pega o valor total de indice
        System.out.println(numeros.charAt(0));  // pega o indice
        System.out.println(numeros.replace("5","6")); // troca o primeiro valor pelo segundo valor
        System.out.println(numeros.repeat(1)); // ele repete uma vez
        System.out.println(nome.substring(3, numeros.length())); // substring serve para indicar o ponto de partida do indice após o valor indicado
        String referenteTrim = "  João"; // perceba que tem espaço
        System.out.println(referenteTrim.trim()); // esse trim, serve para tirar os espaços.
    }
}
