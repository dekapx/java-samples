package com.dekapx.java.designpatterns.observer;

public interface Editor {
    void registerViewer(Viewer viewer);

    void removeViewer(Viewer viewer);

    void notifyViewer();
}
