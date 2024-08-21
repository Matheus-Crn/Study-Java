package javacore.Minterfaces.dominio;

public interface DataLoad {

    // ele ja vem carregado de forma public e abstract
    void load();

    // fazendo um metodo que será concreto com o default
    default void checkPermisson(){
        System.out.println("Fazendo checagem de permissões");
    }
}
