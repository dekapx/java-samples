package com.dekapx.java.designpatterns.observer;

public interface Editor {
    void addViewer(Viewer viewer);

    void removeViewer(Viewer viewer);

    void openFile(FileType fileType);
}
