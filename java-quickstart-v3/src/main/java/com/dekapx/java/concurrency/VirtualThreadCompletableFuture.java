package com.dekapx.java.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VirtualThreadCompletableFuture {
    private static String languages = "Java, Scala, Python";

    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(supplier)
                .thenApplyAsync(splitToUpperCase)
                .thenAcceptAsync(print);

        future.join();
    }

    private static Supplier<String> supplier = () ->   languages;

    private static Function<String, List<String>> splitToUpperCase = (languages) -> {
        String[] tokens = languages.split(",");
        return Arrays
                .stream(tokens)
                .map(o -> o.trim().toUpperCase())
                .collect(Collectors.toList());
    };

    private static Consumer<List<String>> print = (tokens) -> {
        tokens.forEach(System.out::println);
    };
}
