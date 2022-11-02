package com.dekapx.java.designpatterns.factory;

public class NotifierFactoryImpl implements NotifierFactory {
    public Notifier getNotifier(NotifierType notifierType) {
        return notifierType.build();
    }
}
