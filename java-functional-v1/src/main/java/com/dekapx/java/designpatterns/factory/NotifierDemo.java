package com.dekapx.java.designpatterns.factory;

import static com.dekapx.java.designpatterns.factory.NotifierType.EMAIL;
import static com.dekapx.java.designpatterns.factory.NotifierType.TEXT;

public class NotifierDemo {
    public static void main(String[] args) {
        NotifierFactory factory = new NotifierFactoryImpl();
        factory.getNotifier(EMAIL).notify("Hello");
        factory.getNotifier(TEXT).notify("World");
    }
}
