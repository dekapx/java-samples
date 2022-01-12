package com.dekapx.java.datastructures;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        final List<String> elements = List.of("Java", "Scala", "Kotlin", "GOLang");
        final Stack<String> stack = new Stack();

        elements.forEach(e -> stack.push(e));

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
