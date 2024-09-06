package academy.devdojo.maratonajava.QstringTest;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Matheus";
        nome =nome.concat(" Carneiro");// dessa forma eu atribuindo o nome para o nome raiz, ele funciona
        nome = nome.substring(0,3); // dessa forma eu atribuindo o nome para o nome raiz, ele funciona
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Matheus");
        sb.append(" Carneiro").append(" Eufrásio"); // aqui estou atribuindo com o append
        sb.reverse(); // aqui estou invertendo
        sb.reverse();// aqui estou invertendo
        sb.delete(0,3); // aqui eu tirei tres letras
        System.out.println(sb);

    }
}
