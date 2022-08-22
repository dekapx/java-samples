package com.dekapx.java.serviceloader;

import java.util.ServiceLoader;

public class FileWriterFactory {
    public static FileWriter getFileWriter(final FileWriterType fileWriterType) {
        final Class<? extends FileWriter> clazz = FileWriterMapper.getMapping(fileWriterType);
        return ServiceLoader
                .load(clazz)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
