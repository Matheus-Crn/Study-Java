package javacore.Oexception.RunTimeTest;

public class RumTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            return "conexão aberta";
            //   System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // sempre será executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
