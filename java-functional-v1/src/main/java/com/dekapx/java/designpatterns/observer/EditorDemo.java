package com.dekapx.java.designpatterns.observer;

public class EditorDemo {
    public static void main(String[] args) {
        final Editor editor = new ProjectExplorer();

        final Viewer fileViewer = new FileViewer();
        final Viewer outlineViewer = new OutlineViewer();
        final Viewer propertyViewer = new PropertyViewer();

        editor.addViewer(fileViewer);
        editor.addViewer(outlineViewer);
        editor.addViewer(propertyViewer);
        editor.notifyViewers(new FileType("HelloWorld", ""));
        System.out.println("After removal...");
        editor.removeViewer(propertyViewer);
        editor.notifyViewers();
    }
}
