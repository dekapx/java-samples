package com.dekapx.java.generics;

import static com.dekapx.java.generics.GenericMethod.arrayToList;
import static com.dekapx.java.generics.GenericMethod.print;

public class GenericArrayToList {
    public static void main(String[] args) {
        final Integer[] numbers = {10, 20, 30};
        print(arrayToList(numbers));

        final String[] languages = {"Java", "Scala", "Kotlin"};
        print(arrayToList(languages));
    }
}
