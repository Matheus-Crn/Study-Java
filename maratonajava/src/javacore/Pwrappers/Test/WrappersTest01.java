package javacore.Pwrappers.Test;

public class WrappersTest01 {
    public static void main(String[] args) {
        // dessa forma ele é byte code
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'A';
        boolean booleanP = false;

        //dessa forma ele usa o polimorfismo
        byte byteW = 1;
        short shortW = 1;
        int intW = 1;
        long longW = 10L;
        float floatW = 10F;
        double doubleW = 10D;
        char charW = 'A';
        boolean booleanW = false;
    }
}
