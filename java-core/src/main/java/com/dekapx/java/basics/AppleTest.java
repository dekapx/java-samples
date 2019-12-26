package com.dekapx.java.basics;

import com.dekapx.java.model.Apple;
import com.dekapx.java.model.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Apple Test Example
 */
public class AppleTest {
    public static void main(String[] args) {
        print(getApples(Color.RED, 150));
        System.out.println("-----------------------------------------------");
        print(getApples(Color.GREEN, 150));
    }

    // test method...
    private static Predicate<Apple> redAndHeavyApplePredicate(final Color color, final int weight) {
        return colorPredicate(color).and(weightPredicate(weight));
    }
    
    private static Predicate<Apple> colorPredicate(final Color color) {
        return (a -> a.getColor().equals(color));
    }

    private static Predicate<Apple> weightPredicate(final int weight) {
        return (a -> a.getWeight() > weight);
    }

    private static List<Apple> getApples(final Color color, final int weight) {
        final List<Apple> inventory = getInventory();

        return inventory.stream()
                .filter(colorPredicate(color).and(weightPredicate(weight)))
                .collect(Collectors.toList());
    }

    private static void print(final List<Apple> items) {
        items.forEach(System.out::println);
    }

    private static List<Apple> getInventory() {
        final List<Apple> inventory = new ArrayList<>();
        inventory.add(Apple.builder().type("Empire").color(Color.RED).weight(250).build());
        inventory.add(Apple.builder().type("Golden Delicious").color(Color.GREEN).weight(90).build());
        inventory.add(Apple.builder().type("Gala").color(Color.RED).weight(125).build());
        inventory.add(Apple.builder().type("Granny Smith").color(Color.RED).weight(180).build());
        inventory.add(Apple.builder().type("Jonagold").color(Color.GREEN).weight(200).build());
        return inventory;
    }
}
