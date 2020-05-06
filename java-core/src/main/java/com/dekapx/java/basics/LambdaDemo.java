package com.dekapx.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface HelloWorld {
    String sayHello(String arg);
}

public class LambdaDemo {


    private static void runnableLambda() {
        new Thread(() -> System.out.println("Running in a thread...")).start();
    }
}
