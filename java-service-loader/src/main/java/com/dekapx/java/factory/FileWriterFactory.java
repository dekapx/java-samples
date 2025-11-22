package com.dekapx.java.factory;

import com.dekapx.java.writer.FileWriter;

import java.util.ServiceLoader;

public class FileWriterFactory {
    public FileWriter getFileWriter() {
        ServiceLoader<FileWriter> serviceLoader = ServiceLoader.load(FileWriter.class);
        return serviceLoader
                .findFirst()
                .orElseThrow(() -> new NoClassDefFoundError("No FileWriter implementation found..."));
    }
}
