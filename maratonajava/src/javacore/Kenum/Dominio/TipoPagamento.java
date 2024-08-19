package javacore.Kenum.Dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            // qual sera o desconto abaixo
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // não pode ter corpo
    public abstract double calcularDesconto(double valor);

}
