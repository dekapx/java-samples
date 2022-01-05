package com.dekapx.java.consumer;

public interface TriConsumer<F, S, T> {
    void accept(F first, S second, T third);
}
