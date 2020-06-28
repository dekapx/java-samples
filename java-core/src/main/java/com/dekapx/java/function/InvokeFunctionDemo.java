package com.dekapx.java.function;

import java.util.function.Function;

public class InvokeFunctionDemo {
    public static void main(String[] args) {
        String output = invoke("DeKapx", func);
        System.out.println(output);
    }

    private static Function<String, String> func = (arg) -> "Hello ! " + arg;

    private static String invoke(String arg, Function<String, String> function) {
        return function.apply(arg);
    }
}
