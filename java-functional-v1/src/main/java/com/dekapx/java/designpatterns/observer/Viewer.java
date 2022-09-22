package com.dekapx.java.designpatterns.observer;

public sealed interface Viewer permits FileViewer, OutlineViewer, PropertyViewer {
    void refreshView();
}
