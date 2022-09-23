package com.dekapx.java.designpatterns.observer;

import javax.swing.text.View;
import java.util.StringJoiner;

public final class PropertyViewer implements Viewer {
    @Override
    public void refreshView(FileType fileType) {
        System.out.println(new StringJoiner(" ")
                .add("PropertyViewer:")
                .add("Opening File: ")
                .add(fileType.fileName() + fileType.extension()));
    }
}
