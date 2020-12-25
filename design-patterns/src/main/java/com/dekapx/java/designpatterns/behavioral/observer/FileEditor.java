package com.dekapx.java.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileEditor implements Editor {
    private final Object MUTEX = new Object();

    private List<Viewer> viewers;

    public FileEditor() {
        this.viewers = new ArrayList<>();
    }

    @Override
    public void registerViewer(final Viewer viewer) {
        if (Objects.isNull(viewer)) {
            throw new IllegalArgumentException("Viewer must not be null or empty");
        }
        if (!(viewer instanceof Viewer)) {
            throw new IllegalArgumentException("Viewer must be a valid implementation of Viewer class");
        }
        if (this.viewers.contains(viewer)) {
            throw new DuplicateViewerException(viewer.getClass().getSimpleName());
        }
        synchronized (MUTEX) {
            this.viewers.add(viewer);
        }
    }

    @Override
    public void unregisterViewer(final Viewer viewer) {
        synchronized (MUTEX) {
            this.viewers.remove(viewer);
        }
    }

    @Override
    public void update(final FileInfo fileInfo) {
        notifyViewers(fileInfo);
    }

    public void notifyViewers(final FileInfo fileInfo) {
        this.viewers.forEach(viewer -> viewer.update(fileInfo));
    }
}
