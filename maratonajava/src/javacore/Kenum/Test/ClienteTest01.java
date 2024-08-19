package javacore.Kenum.Test;

import javacore.Kenum.Dominio.Cliente;
import javacore.Kenum.Dominio.TipoCliente;
import javacore.Kenum.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ronaldo", TipoCliente.PESSOA_JURIDICA, javacore.Kenum.Dominio.TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Messi", TipoCliente.PESSOA_FISICA, javacore.Kenum.Dominio.TipoPagamento.DEBITO);

        System.out.println(String.valueOf(cliente1));
        System.out.print(String.valueOf(cliente2));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente1 =TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipoCliente2);

    }
}
