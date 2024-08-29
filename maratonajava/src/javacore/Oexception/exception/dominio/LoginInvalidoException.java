package javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    // para criar uma exceção customizada quando extends de Exception

    public LoginInvalidoException() {
        super("login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message); // caso queira uma mensagem diferente, so usar esse construtor
    }
}
