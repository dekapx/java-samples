package com.dekapx.java.designpatterns.behavioral.strategy.example;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
