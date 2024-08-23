package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.Servico.RepositorioArquivo;
import javacore.Npolimorfismo.Servico.RepositorioBancoDeDados;
import javacore.Npolimorfismo.Servico.RepositorioMemoria;
import javacore.Npolimorfismo.repositorio.Repositorio;

public class repositorioTeste {
    public static void main(String[] args) {
        // quero salvar no banco de dados
        // dessa forma so poderia salvar para o banco de dados e o condigo ficaria extenso.
        // RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();

        // dessa forma generica seria melhor, pois teria acesso a qualquer classe com o mesmo metodo
        Repositorio repositorio = new RepositorioMemoria(); // dessa forma eu so acesso diretamente o metodo criado e não o objeto diretamente
        Repositorio repositorio1 = new RepositorioArquivo(); // aqui eu acesso outro metodo, e não o objeto
        repositorio.salvar(); // imprimindo o variável generica que recebeu o metodo salvar com a descrição
        repositorio1.salvar();


    }
}
