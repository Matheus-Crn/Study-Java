package javacore.Kenum.Test;

import javacore.Kenum.Dominio.Cliente;
import javacore.Kenum.Dominio.Cliente.TipoPagamento;
import javacore.Kenum.Dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ronaldo", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Messi", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.printf(String.valueOf(cliente1));
        System.out.printf(String.valueOf(cliente2));


    }
}
