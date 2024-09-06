package academy.devdojo.maratonajava.Rdatas.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // usamos o calendario gregoriano
        // se o dia da semana for igual a domingo
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  // dia da semana
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // dia do mes
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // dia ano
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // dia da semana do mes

        calendar.add(Calendar.DAY_OF_MONTH,0); // adicionar dia
        calendar.roll(Calendar.HOUR, 12); // adicionar horas
        Date date = calendar.getTime(); // instanciando
        System.out.println(date);
    }
}
