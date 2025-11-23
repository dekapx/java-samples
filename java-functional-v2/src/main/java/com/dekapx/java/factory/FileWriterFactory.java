package com.dekapx.java.factory;

import com.dekapx.java.model.FileWriter;
import com.dekapx.java.model.FileType;

public final class FileWriterFactory {
    private FileWriterFactory() {}

    public static FileWriter getFileWriter(FileType type) {
        return type.build();
    }
}
