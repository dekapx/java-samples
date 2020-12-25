package com.dekapx.java.designpatterns.behavioral.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No Quack...");
    }
}
