package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.Leitor1;
import javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    // exemplo de ler arquivo usando java
    // classe Rader usada para ler arquivo
    // BufferedReader() versao mais atualiza que usa um buff
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) { // são fechados na forma inversa do que são declarados

        } catch (IOException e) {
        }

   /* public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
    }
}
