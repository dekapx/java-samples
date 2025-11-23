package com.dekapx.java.factory;

import com.dekapx.java.model.FileWriter;
import com.dekapx.java.model.FileWriterType;

public final class FileWriterFactory {
    private FileWriterFactory() {}

    public static FileWriter getFileWriter(FileWriterType type) {
        return type.build();
    }
}
