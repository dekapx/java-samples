package com.dekapx.java.designpatterns.observer;

public final class OutlineViewer implements Viewer {
    @Override
    public void refreshView() {
        System.out.println("OutlineViewer::refreshed");
    }
}
