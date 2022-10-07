package com.dekapx.java.serviceloader;

import java.util.Map;

import static com.dekapx.java.serviceloader.FileWriterType.CSV;
import static com.dekapx.java.serviceloader.FileWriterType.JSON;
import static com.dekapx.java.serviceloader.FileWriterType.TEXT;
import static com.dekapx.java.serviceloader.FileWriterType.XML;
import static java.util.AbstractMap.SimpleImmutableEntry;

public class FileWriterMapper {
    private static final Map<FileWriterType, Class<? extends FileWriter>> fileWriterMappings = Map.ofEntries(
            new SimpleImmutableEntry<>(CSV, CsvFileWriter.class),
            new SimpleImmutableEntry<>(TEXT, TextFileWriter.class),
            new SimpleImmutableEntry<>(XML, XmlFileWriter.class),
            new SimpleImmutableEntry<>(JSON, JsonFileWriter.class));

    public static Class<? extends FileWriter> getMapping(final FileWriterType fileWriterType) {
        return fileWriterMappings.get(fileWriterType);
    }
}
