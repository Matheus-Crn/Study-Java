package academy.devdojo.maratonajava.Sformatacao.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class localeTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeBrasil = new Locale("pt","BR");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat op1 =DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        System.out.println("Italia "+op1.format(calendar.getTime())); // dessa forma imprimi a a data no idioma definido
        // como é escrito a linguagem portuguesa na India
        System.out.println(localeBrasil.getDisplayLanguage(localeIndia)); // language linguagem do pais
        System.out.println(localeBrasil.getDisplayCountry(localeBrasil)); // Country país
        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));
        System.out.println(localeJapao.getDisplayLanguage(localeItaly));

    }
}
