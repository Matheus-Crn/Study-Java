package javacore.Npolimorfismo.Servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
