package academy.devdojo.maratonajava.QstringTest;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        // diferença de performance de String - StringBuilder - StringBuffer
        long inicio = System.currentTimeMillis();
        concatString(23_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim - inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(23_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim - inicio)+"ms");

        inicio =System.currentTimeMillis();
        concatStringBuffer(23_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim - inicio)+"ms");

    }
    public static void concatString(int tamaho){
        String texto = "";
        for (int i = 0; i <tamaho ; i++) {
            texto+=i;
        }
    }
    public static void concatStringBuilder(int tamaho){
        StringBuilder sb = new StringBuilder(tamaho);
        for (int i = 0; i <tamaho ; i++) {
            sb.append(i);
        }
    }
    public static void concatStringBuffer(int tamaho){ // vejamos que temos que atribui entre parenteses areferencia
        StringBuffer sb = new StringBuffer(tamaho); // temos que instanciar tipo objeto
        for (int i = 0; i <tamaho ; i++) {
            sb.append(i); // para imprimir
        }
    }
}
