package javacore.Oexception.RunTimeTest;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
     divisao(1,0);
        System.out.println("Codigo finalizado");
    }

    public static int divisao(int a, int b) throws IllegalArgumentException{ // existe essa opção

        if (b == 0) {
            throw new IllegalArgumentException("Numero invalido"); // lançar novas sessoes
            //throw new RuntimeException("Numero invalido"); Constrói uma nova exceção de tempo de execução com a mensagem de detalhes e causa especificadas.
            // Observe que a mensagem de detalhes associada à causa não é incorporada automaticamente na mensagem de detalhes desta exceção de tempo de execução.
        }
        return a / b;
    }
}
