package com.dekapx.java.basics;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum ShapeType {
    CIRCLE, SQUARE;
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("this is a Square");
    }
}

public class SteamMap {
    private static Map<ShapeType, Shape> map = Stream.of(
            new AbstractMap.SimpleImmutableEntry<>(ShapeType.CIRCLE, new Circle()),
            new AbstractMap.SimpleImmutableEntry<>(ShapeType.SQUARE, new Square()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    public static void main(String[] args) {
        Shape shape = getShape(ShapeType.CIRCLE);
        shape.draw();
    }

    private static Shape getShape(ShapeType type) {
        return map.get(type);
    }
}
