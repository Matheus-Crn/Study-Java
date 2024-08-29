package javacore.Oexception.RunTimeTest;

import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArithmeticException e){ //mais generica
            System.out.println("Você está dentro de ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Você está dentro de RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (SQLException | FileAlreadyExistsException e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileAlreadyExistsException{
        
    }
}
