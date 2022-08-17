package com.dekapx.java.serviceloader;

import java.util.AbstractMap;
import java.util.Map;

import static com.dekapx.java.serviceloader.FileWriterType.CSV;
import static com.dekapx.java.serviceloader.FileWriterType.TEXT;
import static com.dekapx.java.serviceloader.FileWriterType.XML;

public class FileWriterMapper {
    private static final Map<FileWriterType, Class<? extends FileWriter>> fileWriterMappings = Map.ofEntries(
            new AbstractMap.SimpleImmutableEntry<>(CSV, CsvFileWriter.class),
            new AbstractMap.SimpleImmutableEntry<>(TEXT, TextFileWriter.class),
            new AbstractMap.SimpleImmutableEntry<>(XML, XmlFileWriter.class));

    public static Class<? extends FileWriter> getMapping(final FileWriterType fileWriterType) {
        return fileWriterMappings.get(fileWriterType);
    }
}
