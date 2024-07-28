package javacore.Gassociacao.Test;

import javacore.Gassociacao.Dominio.Escola;
import javacore.Gassociacao.Dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Senhor Caio");
        Professor professor1 = new Professor("Tenhor Caio");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Dragon Ball", professores);



        escola.imprime();
    }
}
