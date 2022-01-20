package com.dekapx.java.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamBoxedDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(toList1.apply(numbers));
        System.out.println(toList2.apply(numbers));
    }

    /**
     * Boxed and convert int[] to List<Integer>
     */
    private static Function<int[], List<Integer>> toList1 = (numbers) ->
            IntStream.of(numbers)
                    .boxed()
                    .collect(Collectors.toList());

    private static Function<int[], List<Integer>> toList2 = (numbers) ->
            IntStream.of(numbers)
                    .mapToObj(Integer::valueOf)
                    .collect(Collectors.toList());
}
