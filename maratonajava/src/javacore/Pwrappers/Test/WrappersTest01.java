package javacore.Pwrappers.Test;

public class WrappersTest01 {
    public static void main(String[] args) {
        // dessa forma ele é byte code
        // Tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'A';
        boolean booleanP = false;
        //dessa forma ele usa o polimorfismo e são object - Wrappers
        // autoboxing
        byte byteW = 1;
        short shortW = 1;
        int intW = 1;
        long longW = 10L;
        float floatW = 10F;
        double doubleW = 10D;
        char charW = 'A';
        boolean booleanW = false;
        // unboxing
        int i = intW; // dessa forma eu converto de wrappers para tipo primitivo
        Integer intW2 = Integer.parseInt("11");
        boolean verdadeiro = Boolean.getBoolean(null);
        System.out.println(verdadeiro);

        double d = 135.4;
        int intergerValue = (int) d;
        System.out.println(intergerValue); //Embora o valor duplo seja explicitamente convertido em valor inteiro, também chamado de downcasting.

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit(1));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
    }
}
