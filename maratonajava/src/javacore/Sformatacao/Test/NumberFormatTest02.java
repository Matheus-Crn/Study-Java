package academy.devdojo.maratonajava.Sformatacao.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];

        // getCurrencyInstance define para moeda monetária
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localePT);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeIT);


        double valor = 10_000.2130;
        for (NumberFormat numberFormat : numberFormats){
            System.out.println(numberFormat.format(valor));
        }

    }
}
