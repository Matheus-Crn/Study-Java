package academy.devdojo.maratonajava.Rdatas.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        // Cria uma instância de LocalTime com o horário específico 23:46:12 (horas, minutos, segundos)
        LocalTime time = LocalTime.of(23, 46, 12);

        // Obtém o horário atual do sistema
        LocalTime timeNow = LocalTime.now();

        // Imprime o horário criado (23:46:12)
        System.out.println(time);

        // Imprime o horário atual do sistema
        System.out.println(timeNow);

        // Exibe a hora do objeto 'time' (23)
        System.out.println(time.getHour());

        // Exibe os minutos do objeto 'time' (46)
        System.out.println(time.getMinute());

        // Exibe os segundos do objeto 'time' (12)
        System.out.println(time.getSecond());

        // Exibe a hora no formato de 12 horas (horário do relógio, ou seja, o valor 11)
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        // Exibe o menor valor possível de LocalTime (00:00), ou seja, meia-noite
        System.out.println(LocalTime.MIN);

        // Exibe o maior valor possível de LocalTime (23:59:59.999999999), ou seja, o último momento do dia
        System.out.println(LocalTime.MAX);
    }
}
