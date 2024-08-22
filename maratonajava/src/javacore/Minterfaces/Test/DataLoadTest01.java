package javacore.Minterfaces.Test;

import javacore.Minterfaces.dominio.DataLoad;
import javacore.Minterfaces.dominio.DateBaseLoad;
import javacore.Minterfaces.dominio.FileLoad;

import java.util.Objects;

public class DataLoadTest01 {
    public static void main(String[] args) {
        // Declarando objetos
        DateBaseLoad dateBaseLoad = new DateBaseLoad();
        FileLoad fileLoad = new FileLoad();

        dateBaseLoad.load(); // carregando metodo load de dateBase
        fileLoad.load();   // carregando metodo load de fileLoad

        dateBaseLoad.remove();
        fileLoad.remover();

        dateBaseLoad.checkPermisson();
        fileLoad.checkPermisson();

        DataLoad.retrieveMaxDataSize(); // carregando metodo da interface e sobrescrevendo
        DateBaseLoad.retrieveMaxDataSize();

        FileLoad.retrieveMaxDataSize();
    }

}
