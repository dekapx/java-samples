package com.dekapx.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppleTest {
    public static void main(String[] args) {
        final List<Apple> items = getApples();
        print(items);
    }

    private static Predicate<Apple> colorPredicate(final Color color) {
        return (a -> a.getColor().equals(color));
    }

    private static List<Apple> getApples() {
        final List<Apple> inventory = getInventory();

        return inventory.stream()
                .filter(colorPredicate(Color.RED))
                .collect(Collectors.toList());
    }

    private static void print(final List<Apple> items) {
        items.forEach(System.out::println);
    }

    private static List<Apple> getInventory() {
        final List<Apple> inventory = new ArrayList<>();
        inventory.add(Apple.builder().type("Empire").color(Color.RED).weight(110).build());
        inventory.add(Apple.builder().type("Golden Delicious").color(Color.GREEN).weight(90).build());
        inventory.add(Apple.builder().type("Gala").color(Color.RED).weight(125).build());
        inventory.add(Apple.builder().type("Granny Smith").color(Color.RED).weight(180).build());
        inventory.add(Apple.builder().type("Jonagold").color(Color.GREEN).weight(200).build());
        return inventory;
    }
}
