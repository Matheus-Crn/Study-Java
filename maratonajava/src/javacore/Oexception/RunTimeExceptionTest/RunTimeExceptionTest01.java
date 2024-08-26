package javacore.Oexception.RunTimeExceptionTest;

import java.lang.reflect.Array;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        // RuntimeException erro do programador e não precisa ser tratada
       int[] list = {1,2};
        System.out.println(list[3]);// vai causar erro, porque a posição não existe
    }
}
