package com.dekapx.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
//    private static final String REGEX = "[\\w]{2}[\\d]{5,6}";    // AA123456
    private static final String PHONE_REGEX = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public static void main(String[] args) {
//        validatePhone();
        validateEmail();
    }

    private static void validatePhone() {
        final Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher("+353 (123) 222 3456");
        System.out.println(matcher.matches());
    }

    private static void validateEmail() {
        final Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher("test@domain.com");
        System.out.println(matcher.matches());
    }
}
