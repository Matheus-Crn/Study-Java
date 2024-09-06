package academy.devdojo.maratonajava.QstringTest;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Matheus";
        String nome2 = "Matheus";
        nome = nome.concat(" Carneiros");

        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Matheus"); // 1 variavel de referencia, 2 objeto de tipo String, 3 String no poo String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // pega o que tenho internamente de valor, e não endereço
    }
}
