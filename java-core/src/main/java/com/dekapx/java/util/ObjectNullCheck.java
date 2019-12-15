package com.dekapx.java.util;

import java.util.Objects;

public class ObjectNullCheck {
    public static void main(String[] args) {
        final String str = null;
        System.out.println(Objects.isNull(str));
    }
}
