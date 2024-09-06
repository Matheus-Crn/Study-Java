package academy.devdojo.maratonajava.Rdatas.Test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1725650341649L);
        System.out.println(date); // dessa forma eu imprimo a data certamente
        System.out.println(date.getTime()); // com o () vazio e getTime aqui eu consigo ver o numero long do dia
    }
}
