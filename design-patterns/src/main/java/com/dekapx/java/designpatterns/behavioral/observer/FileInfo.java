package com.dekapx.java.designpatterns.behavioral.observer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FileInfo {
    private String fileName;
    private String extension;
}
