package academy.devdojo.maratonajava.Rdatas.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        // Exibindo a data atual usando a classe Date (antiga API)
        System.out.println(new Date());

        // Exibindo a data e hora atual usando a classe Calendar (antiga API)
        System.out.println(Calendar.getInstance());

        // Exibindo o valor numérico do mês de Setembro
        System.out.println(Month.SEPTEMBER.getValue());

        // Criando um objeto LocalDate representando 17 de Setembro de 2022
        LocalDate date = LocalDate.of(2022, Month.SEPTEMBER, 17);

        // Obtendo a data atual
        LocalDate agora = LocalDate.now();

        // Somando 4 semanas à data atual
        agora = agora.plusWeeks(4);

        // Exibindo vários detalhes sobre o objeto LocalDate 'date'
        System.out.println(date.getYear());           // Ano
        System.out.println(date.getMonth());          // Mês
        System.out.println(date.getMonthValue());     // Valor numérico do mês
        System.out.println(date.getDayOfWeek());      // Dia da semana
        System.out.println(date.getDayOfMonth());     // Dia do mês
        System.out.println(date.lengthOfMonth());     // Quantidade de dias no mês
        System.out.println(date.get(ChronoField.YEAR));            // Ano usando ChronoField
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));    // Dia do mês usando ChronoField

        // Exibindo o objeto LocalDate 'date' e a data após adicionar 4 semanas
        System.out.println(date);
        System.out.println(agora);
    }
}
