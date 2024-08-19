package javacore.Kenum.Dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa fisica"),
    PESSOA_FISICA(4, "pessoa juridica");

    private int valor; // não pode ir antes das numerações
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

   public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
       for (TipoCliente tipoCliente : values()) {
           if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
               return tipoCliente;
           }
       }
       return null;

   }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
