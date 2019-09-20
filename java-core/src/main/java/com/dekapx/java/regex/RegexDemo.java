package com.dekapx.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        final String regex = "[\\w]{2}[\\d]{5,6}";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher("AA123456");
        System.out.println(matcher.matches());
    }
}
