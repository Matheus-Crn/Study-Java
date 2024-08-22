package javacore.Minterfaces.dominio;

public interface DataLoad {
    // atributos na interface
    public static  final  int MAX_DATA_SIZE = 10;

    // ele ja vem carregado de forma public e abstract
    void load();

    // fazendo um metodo que será concreto com o default
    default void checkPermisson(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMax");
    }
}
