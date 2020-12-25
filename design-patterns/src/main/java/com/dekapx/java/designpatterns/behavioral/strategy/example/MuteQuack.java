package com.dekapx.java.designpatterns.behavioral.strategy.example;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No Quack...");
    }
}
