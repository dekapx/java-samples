package com.dekapx.java.factory;

import com.dekapx.java.writer.FileWriter;
import com.dekapx.java.writer.FileType;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.function.Predicate;

import static com.dekapx.java.writer.FileType.CSV;
import static com.dekapx.java.writer.FileType.TEXT;
import static com.dekapx.java.writer.FileType.XML;

public final class FileWriterFactory {
    private FileWriterFactory() {}

    private static Map<FileType, String> writerTypeMap = Map.of(
            CSV, "CsvFileWriter",
            TEXT, "TextFileWriter",
            XML, "XmlFileWriter"
    );

    private static Predicate<ServiceLoader.Provider<FileWriter>> serviceProviderPredicate(FileType type) {
        return o -> o.get().getClass().getSimpleName().equals(writerTypeMap.get(type));
    }

    public static FileWriter getFileWriter(FileType type) {
        ServiceLoader<FileWriter> serviceLoader = ServiceLoader.load(FileWriter.class);
        return serviceLoader.stream()
                .filter(serviceProviderPredicate(type))
                .map(ServiceLoader.Provider::get)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such FileWriter available"));
    }


}
