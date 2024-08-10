package javacore.Hheranca.Test;

import javacore.Hheranca.Dominio.Endereco;
import javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("RUA: Manoel marinho");
        endereco.setCep("CEP= 1223920.20");
        Pessoa pessoa = new Pessoa("Carlos");
        pessoa.setNome("Matheus");
        pessoa.setCpf("CPF= 155243638120");
        pessoa.setEndereco(endereco);
        
        pessoa.imprime();
    }
}
