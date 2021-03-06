package com.dekapx.java.basics;

import com.dekapx.java.model.Apple;
import com.dekapx.java.model.Color;

import java.util.List;
import java.util.function.Predicate;

import static com.dekapx.java.model.Color.GREEN;
import static com.dekapx.java.model.Color.PINK;
import static com.dekapx.java.model.Color.RED;
import static com.dekapx.java.util.StreamUtil.filterCollectionByAndPredicates;
import static com.dekapx.java.util.StreamUtil.filterCollectionByOrPredicates;

public class AppleInventoryDemo {
    public static void main(String[] args) {
        final List<Apple> inventory = getInventory();
        printInventory(filterCollectionByAndPredicates(inventory,
                List.of(colorPredicate(GREEN), weightPredicate(150))));
        printInventory(filterCollectionByOrPredicates(inventory,
                List.of(colorPredicate(RED), colorPredicate(GREEN), colorPredicate(PINK))));
    }

    private static Predicate<Apple> colorPredicate(final Color color) {
        return apple -> color.equals(apple.getColor());
    }

    private static Predicate<Apple> weightPredicate(final int weight) {
        return apple -> apple.getWeight() >= weight;
    }

    private static void printInventory(final List<Apple> inventory) {
        System.out.println("-----------------------------");
        inventory.forEach(apple -> System.out.println(apple));
    }

    private static List<Apple> getInventory() {
        return List.of(
                Apple.builder().color(GREEN).weight(150).build(),
                Apple.builder().color(GREEN).weight(100).build(),
                Apple.builder().color(RED).weight(150).build(),
                Apple.builder().color(RED).weight(250).build(),
                Apple.builder().color(PINK).weight(100).build()
        );
    }
}
