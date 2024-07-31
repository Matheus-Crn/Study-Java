package javacore.Gassociacao.Test;

import javax.swing.*;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //JOptionPane.showMessageDialog(null,"Digite seu nome:");  Emite mensagem de alert
        //String resposta = JOptionPane.showInputDialog("Digite seu nome:");  emite uma caixa de pergunta, a pergunta sera o que tem entre aspas
        // int res = JOptionPane.showConfirmDialog(null, "voce é casado?"); emite uma caixa de pergunta com as opções SIM (2), Não(1), CANCELAR(-1). cada uma tem um valor em memoria
        //System.out.println(res);
        System.out.println("Digite seu nome:");
        //somente o next -> imprime apenas a primeira palavra
        String nome = entrada.nextLine(); // imprime a linha inteira com todos os caracteres
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt(); // imprime numeros inteiros
        System.out.println("Digite seu sexo entre as opções de acordo com M e F");
        char sexo = entrada.next().charAt(0); // aqui eu declaro um char na posição 0 a primeira posição do primeiro caractere

        System.out.println("Seja bem vindo(a) " + nome + ", é bom saber que você tem " + idade + " anos e você se identifica com o sexo " + sexo);
    }
}
