package javacore.Minterfaces.dominio;

public class FileLoad implements DataLoad{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }
    public void remover(){
        System.out.println("Deletando dados de um arquivo");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da clase Fileload");
    }
}
