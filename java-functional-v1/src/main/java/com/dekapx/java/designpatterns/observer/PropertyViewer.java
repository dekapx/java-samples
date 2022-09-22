package com.dekapx.java.designpatterns.observer;

import javax.swing.text.View;

public final class PropertyViewer implements Viewer {
    @Override
    public void refreshView() {
        System.out.println("PropertyViewer::refreshed");
    }
}
