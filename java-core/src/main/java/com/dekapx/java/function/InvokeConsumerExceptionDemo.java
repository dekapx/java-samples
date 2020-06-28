package com.dekapx.java.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface ThrowingConsumer<T, E extends Exception> {
    void accept(T type) throws E;
}

public class InvokeConsumerExceptionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(throwingConsumerWrapper(i -> printConsumer.accept(i)));
    }

    private static Consumer<Integer> printConsumer = (num) -> {
        System.out.println(num);
    };

    private static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {
        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
