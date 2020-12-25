package com.dekapx.java.designpatterns.behavioral.observer;

public interface Editor {
    void registerViewer(Viewer viewer);
    void unregisterViewer(Viewer viewer);
    void update(FileInfo fileInfo);
}
