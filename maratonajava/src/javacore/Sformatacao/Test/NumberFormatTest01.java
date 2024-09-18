package academy.devdojo.maratonajava.Sformatacao.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[8];

        // formatação de numeros
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[2] = NumberFormat.getInstance(localePT);
        numberFormats[3] = NumberFormat.getInstance(localeIT);


        double valor = 10_000.2130;
        for (NumberFormat numberFormat : numberFormats){
            System.out.println(numberFormat.format(valor));

        }

    }
}
