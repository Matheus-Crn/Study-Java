package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDeDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDeDoisNumeros(){
        System.out.println(1-2);
    }
    public void multiplicaDeDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);

    }
    public double divideDeDoisNumeros(double num1, double num2){
      if (num2 != 0){
          return 0;
      }
        return num1/num2;
    }

    public void imprimeDeDoisNumeros(double num1, double num2){
       if (num2 == 0){
           System.out.println("existe divisão por 0");
       }else {
        System.out.println(num1/num2);
       }
    }

    public void alteraDoisNumeros(double numero1, double numero2 ){
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do método altera");
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);
    }

    public void somaArray (int [] numeros ) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs (int... numeros ) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }


}
