package com.dekapx.java.designpatterns.behavioral.observer;

import java.util.Objects;

public class OutlineViewer implements Viewer {
    private final String EDITOR_NAME = "OutlineViewer";

    @Override
    public void update(final FileInfo fileInfo) {
        final String info = "OutlineViewer update for File [%s] of Type [%s]";
        System.out.println(String.format(info, fileInfo.getFileName(), fileInfo.getExtension()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutlineViewer that = (OutlineViewer) o;
        return EDITOR_NAME.equals(that.EDITOR_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EDITOR_NAME);
    }

    @Override
    public String toString() {
        return "OutlineViewer{" +
                "EDITOR_NAME='" + EDITOR_NAME + '\'' +
                '}';
    }
}
