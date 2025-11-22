package com.dekapx.java.generic;

import com.dekapx.java.model.Circle;
import com.dekapx.java.model.Rectangle;
import com.dekapx.java.model.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {
    static void main() {
        String[] languages = {"Java", "Python", "JavaScript", "C#", "C++"};
        toList(languages).forEach(System.out::println);

        Integer[] marks = {85, 90, 78, 92, 88};
        toList(marks).forEach(System.out::println);

        Shape[] shapes = {new Circle(), new Rectangle()};
        toList(shapes).forEach(System.out::println);
    }

    private static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Arrays.stream(array).forEach(list::add);
        return list;
    }
}
