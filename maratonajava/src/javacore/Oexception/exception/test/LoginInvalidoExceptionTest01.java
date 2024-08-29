package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        // para acessar metodo e imprimir, ele pede assinatura ou o try, catch
        try {
            logar();

        } catch (LoginInvalidoException e) { // caso for atribuído dados errados, o catch irá rodar imprimindo uma exceção RuntimeException
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInvalidoException {
        // esse metodo vamos simular que teremos dois valores no banco de dados
        Scanner teclado = new Scanner(System.in); // puxando scanner
        String usernameDB = "matheusalc017@gmail.com"; // definindo usuário que deve ser informado
        String senhaDB = "Senha0712@"; // definindo senha que deve ser informado
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine(); // vai receber o nome do usuário que declarou
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();   // vai receber a senha do usuário que declarou

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){ // sinal de ! ja serve como diferente ou pergunta, tipo if -> se (! for diferente
           throw new LoginInvalidoException("Senha invalida, tente novamente"); // retorna o erro, mas tenho que sobrescrever no metodo
        }
        System.out.println("Usuário logado com sucesso");
    }
}
