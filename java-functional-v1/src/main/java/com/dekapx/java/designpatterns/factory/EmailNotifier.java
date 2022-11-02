package com.dekapx.java.designpatterns.factory;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String notification) {
        System.out.println("Send email notification...");
    }
}
