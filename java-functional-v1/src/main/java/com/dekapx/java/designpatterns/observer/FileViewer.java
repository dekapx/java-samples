package com.dekapx.java.designpatterns.observer;

public final class FileViewer implements Viewer {
    @Override
    public void refreshView() {
        System.out.println("FileViewer::refreshed");
    }
}
