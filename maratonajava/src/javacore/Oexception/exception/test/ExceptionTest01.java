package javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException{ // dessa maneira eu não preciso tratar
        // que receba um tratamento do tipo checked podemos utilizar algo do java

        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{ // throws IOException colocando o tratamento para quem chamar o metodo
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile(); //file lança a exceção
            System.out.println(isCriado);
        } catch (IOException e) {
            // nao pode deixar esse bloco em branco em hipótese alguma
            // evite colocar regra de negócio dentro do catch
            e.printStackTrace();// impressão do console
            throw e;
        }
    }
}
