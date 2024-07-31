package javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        // usando o if para fazer parâmetros de impressão
        Scanner sc = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não :");
        String pergunta = sc.nextLine();
        if (pergunta.charAt(0)==' ') {  // IgnoreCase ele recebe maiúscula e minuscula
            System.out.println("ola voce disse sim");
            sc.close(); // Fecha o arquivo
        }else{
            System.out.println("ola voce disse não");
            sc.close();
        }
    }
}
