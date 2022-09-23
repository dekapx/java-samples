package com.dekapx.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ProjectExplorer implements Editor {
    private final List<Viewer> viewers = new ArrayList<>();

    @Override
    public void addViewer(Viewer viewer) {
        viewers.add(viewer);
    }

    @Override
    public void removeViewer(Viewer viewer) {
        viewers.remove(viewer);
    }

    @Override
    public void openFile(FileType fileType) {
        notifyViewers(fileType);
    }

    public void notifyViewers(FileType fileType) {
        viewers.forEach(viewer -> {
            viewer.refreshView(fileType);
        });
    }
}
