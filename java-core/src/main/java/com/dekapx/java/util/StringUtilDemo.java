package com.dekapx.java.util;

import com.google.common.base.Strings;

public class StringUtilDemo {
    public static void main(String[] args) {
        System.out.println(isValidString(null));

        System.out.println(isValidString("Test"));
    }

    private static boolean isValidString(final String arg) {
        return !Strings.isNullOrEmpty(arg);

    }
}
