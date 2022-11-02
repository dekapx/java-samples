package com.dekapx.java.designpatterns.factory;

public interface NotifierFactory {
    Notifier getNotifier(NotifierType notifierType);
}
