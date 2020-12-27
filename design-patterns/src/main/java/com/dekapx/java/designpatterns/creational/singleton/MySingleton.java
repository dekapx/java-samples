package com.dekapx.java.designpatterns.creational.singleton;

public enum MySingleton {
    INSTANCE;

    public void performAction() {
        System.out.println("Singleton Triggered");
    }
}
