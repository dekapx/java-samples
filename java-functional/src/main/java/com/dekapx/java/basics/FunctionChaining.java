package com.dekapx.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionChaining {
    public static void main(String[] args) {
        final String data = "Java Scala Kotlin Python GoLang";
        List<String> languages = splitFunction.andThen(toListFunction).apply(data);
        System.out.println(languages);
    }

    private static Function<String, String[]> splitFunction = (arg)
            -> arg.split(" ");

    private static Function<String[], List> toListFunction = (tokens) ->
            Arrays.stream(tokens).collect(Collectors.toList());


}
