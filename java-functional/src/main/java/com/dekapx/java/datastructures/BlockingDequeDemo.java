package com.dekapx.java.datastructures;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeDemo {
    public static void main(String[] args) {
        BlockingDeque blockingDeque = new LinkedBlockingDeque();
        blockingDeque.addFirst("Java");
        blockingDeque.addLast("Scala");

        blockingDeque.offer("Kotlin");

        blockingDeque.forEach(i -> System.out.println(i));
    }
}
