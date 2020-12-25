package com.dekapx.java.designpatterns.behavioral.observer;

import java.util.Objects;

public class PropertyViewer implements Viewer {
    private final String EDITOR_NAME = "PropertyViewer";

    @Override
    public void update(final FileInfo fileInfo) {
        final String info = "PropertyViewer update for File [%s] of Type [%s]";
        System.out.println(String.format(info, fileInfo.getFileName(), fileInfo.getExtension()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyViewer that = (PropertyViewer) o;
        return EDITOR_NAME.equals(that.EDITOR_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EDITOR_NAME);
    }

    @Override
    public String toString() {
        return "PropertyViewer{" +
                "EDITOR_NAME='" + EDITOR_NAME + '\'' +
                '}';
    }
}
