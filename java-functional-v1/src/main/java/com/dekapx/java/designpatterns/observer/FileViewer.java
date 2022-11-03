package com.dekapx.java.designpatterns.observer;

import java.util.StringJoiner;

public final class FileViewer implements Viewer {
    @Override
    public void refreshView(FileType fileType) {
        System.out.println(new StringJoiner(" ")
                .add("FileViewer:")
                .add("Opening File: ")
                .add(fileType.fileName() + fileType.extension()));
    }
}
