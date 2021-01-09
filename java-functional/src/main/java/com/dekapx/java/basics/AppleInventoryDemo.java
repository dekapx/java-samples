package com.dekapx.java.basics;

import com.dekapx.java.model.Apple;
import com.dekapx.java.model.Color;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.dekapx.java.model.Color.GREEN;
import static com.dekapx.java.model.Color.RED;

public class AppleInventoryDemo {
    public static void main(String[] args) {
        final int weight = 150;
        final Predicate<Apple> colorPredicate = colorPredicate(GREEN);
        final Predicate<Apple> weightPredicate = weightPredicate(weight);

//        printInventory(getInventory(colorPredicate));
//        printInventory(getInventory(weightPredicate));
//        printInventory(getInventory(colorPredicate, weightPredicate));
        printInventory(getInventory(List.of(colorPredicate, weightPredicate)));
    }

    private static List<Apple> getInventory(final List<Predicate<Apple>> predicates) {
        final List<Apple> inventory = getInventory();
        return inventory.stream()
                .filter(predicates.stream().reduce(apple -> true, Predicate::and))
                .collect(Collectors.toList());
    }

    private static List<Apple> getInventory(final Predicate<Apple> predicate) {
        final List<Apple> inventory = getInventory();
        return inventory.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private static List<Apple> getInventory(final Predicate<Apple> colorPredicate, final Predicate<Apple> weightPredicate) {
        final List<Apple> inventory = getInventory();
        return inventory.stream()
                .filter(colorPredicate.and(weightPredicate))
                .collect(Collectors.toList());
    }

    private static Predicate<Apple> colorPredicate(final Color color) {
        return apple -> color.equals(apple.getColor());
    }

    private static Predicate<Apple> weightPredicate(final int weight) {
        return apple -> apple.getWeight() >= weight;
    }

    private static List<Apple> getGreenApple() {
        final List<Apple> inventory = getInventory();
        return inventory.stream()
                .filter(apple -> GREEN.equals(apple.getColor()))
                .collect(Collectors.toList());
    }

    private static List<Apple> getGreenHeavyApple() {
        final List<Apple> inventory = getInventory();
        return inventory.stream()
                .filter(apple -> GREEN.equals(apple.getColor()) && apple.getWeight() >= 150)
                .collect(Collectors.toList());
    }

    private static void printInventory(final List<Apple> inventory) {
        System.out.println("-----------------------------");
        inventory.forEach(apple -> System.out.println(apple));
    }

    private static List<Apple> getInventory() {
        return List.of(
                Apple.builder().color(GREEN).weight(150).build(),
                Apple.builder().color(GREEN).weight(100).build(),
                Apple.builder().color(RED).weight(150).build()
        );
    }
}
