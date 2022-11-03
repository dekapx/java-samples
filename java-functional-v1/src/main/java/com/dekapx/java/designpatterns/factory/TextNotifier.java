package com.dekapx.java.designpatterns.factory;

public class TextNotifier implements Notifier {
    @Override
    public void notify(String notification) {
        System.out.println("TextNotifier: " + notification);
    }
}
