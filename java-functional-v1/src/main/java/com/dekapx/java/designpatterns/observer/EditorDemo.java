package com.dekapx.java.designpatterns.observer;

public class EditorDemo {
    public static void main(String[] args) {
        final Editor editor = new ProjectExplorer();

        final Viewer fileViewer = new FileViewer();
        final Viewer outlineViewer = new OutlineViewer();
        final Viewer propertyViewer = new PropertyViewer();

        editor.registerViewer(fileViewer);
        editor.registerViewer(outlineViewer);
        editor.registerViewer(propertyViewer);
        editor.notifyViewer();
    }
}
