package com.dekapx.java.designpatterns.behavioral.observer;

public class DuplicateViewerException extends RuntimeException {
    public DuplicateViewerException(String viewerName) {
        super(String.format("%s is already registered as Viewer", viewerName));
    }
}
