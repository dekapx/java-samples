package com.dekapx.java.basics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", Locale.GERMAN, "EEE, dd MMM yyyy HH:mm:ss zzz");
public class Test {
    public static void main(String[] args) throws Exception {
        final String pattern = "EEE, dd MMM yyyy, HH:mm:ss zzz";
        final String dateAsString = "Mi., 09 April 2008, 23:55:38 GMT";

//        final String pattern = "EEE, dd MMM yyyy, HH:mm:ss Z";
//        final String dateAsString = "Mi., 09 Apr 2008, 23:55:38 GMT";
//
//        SimpleDateFormat parser = new SimpleDateFormat(pattern, Locale.GERMAN);
//        Date date = parser.parse(dateAsString);
//        System.out.println(date);

//        SimpleDateFormat f = new SimpleDateFormat("EEE, dd MMM yyyy, HH:mm:ss zzz", Locale.GERMAN);
//        System.out.println(f.format(new Date()));
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale locale: locales) {
            System.out.println(locale.toString());
        }
    }
}
