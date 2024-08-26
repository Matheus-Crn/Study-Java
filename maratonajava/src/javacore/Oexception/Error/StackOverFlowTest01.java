package javacore.Oexception.Error;

public class StackOverFlowTest01 {
    public static void main(String[] args) {

        recursividade(); // dessa forma vai acontecer o ERRO de stackOverFlow e estourar o limite da memoria

    }
    public static void recursividade(){
        recursividade();
    }
}
