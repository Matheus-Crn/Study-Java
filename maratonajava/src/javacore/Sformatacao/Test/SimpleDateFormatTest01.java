package academy.devdojo.maratonajava.Sformatacao.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        // Definindo o padrão de formatação com Locale ENGLISH para aceitar meses em inglês
        String pattern = "dd MMMM yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.ENGLISH);

        // Formatando a data atual com o texto literal
        System.out.println("'Amsterdam' " + sdf.format(new Date()) + " 'de'");

        try {
            // String original com texto literal
            String dateString = "Amsterdam 15 de February de 2024";

            // Removendo o texto literal e espaços extras para realizar o parsing corretamente
            String dateStringClean = dateString
                    .replace("Amsterdam", "")  // Remover "Amsterdam"
                    .replace("de", "")         // Remover "de"
                    .replaceAll("\\s+", " ")   // Substituir múltiplos espaços por um único
                    .trim();                   // Remover espaços no início e no fim

            // Parsing: convertendo a string em uma data
            Date date = sdf.parse(dateStringClean);

            // Exibindo a data após o parsing
            System.out.println(date);
        } catch (ParseException e) {
            // Captura o erro caso a string não esteja no formato esperado
            e.printStackTrace();
        }
    }
}
