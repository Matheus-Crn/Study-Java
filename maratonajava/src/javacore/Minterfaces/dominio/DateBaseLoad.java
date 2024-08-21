package javacore.Minterfaces.dominio;

public class DateBaseLoad implements DataLoad, DateRemover { // Note que eu uso o implements ao invés de extends para interface
    @Override
    public void load() {
        System.out.println("Carrega os dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do banco de dados");

    }

    @Override
    public void checkPermisson() {
        // Dessa forma eu Sobrescrevo o metodo concreto que foi feito e atribuido valores na interface.
        System.out.println("Checando permissão do banco de dados, de forma alterada na classe.");
    }
}
