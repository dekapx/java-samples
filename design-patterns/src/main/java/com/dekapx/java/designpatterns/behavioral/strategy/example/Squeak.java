package com.dekapx.java.designpatterns.behavioral.strategy.example;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak...");
    }
}
