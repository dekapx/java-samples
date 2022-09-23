package com.dekapx.java.designpatterns.observer;

import java.util.StringJoiner;

public final class OutlineViewer implements Viewer {
    @Override
    public void refreshView(FileType fileType) {
        System.out.println(new StringJoiner(" ")
                .add("OutlineViewer:")
                .add("Opening File: ")
                .add(fileType.fileName() + fileType.extension()));
    }
}
