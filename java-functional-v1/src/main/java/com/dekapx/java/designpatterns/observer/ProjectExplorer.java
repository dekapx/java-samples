package com.dekapx.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ProjectExplorer implements Editor {
    private final List<Viewer> viewers = new ArrayList<>();

    @Override
    public void registerViewer(Viewer viewer) {
        viewers.add(viewer);
    }

    @Override
    public void removeViewer(Viewer viewer) {
        viewers.remove(viewer);
    }

    @Override
    public void notifyViewer() {
        viewers.forEach(viewer -> {
            viewer.refreshView();
        });
    }
}
