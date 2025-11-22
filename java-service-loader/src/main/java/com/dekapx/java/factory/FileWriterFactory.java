package com.dekapx.java.factory;

import com.dekapx.java.writer.FileWriter;
import com.dekapx.java.writer.FileWriterType;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.function.Predicate;

import static com.dekapx.java.writer.FileWriterType.CSV;
import static com.dekapx.java.writer.FileWriterType.TEXT;
import static com.dekapx.java.writer.FileWriterType.XML;

public class FileWriterFactory {
    private static Map<FileWriterType, String> writerTypeMap = Map.of(
            CSV, "CsvFileWriter",
            TEXT, "TextFileWriter",
            XML, "XmlFileWriter"
    );

    private static Predicate<ServiceLoader.Provider<FileWriter>> serviceProviderPredicate(FileWriterType type) {
        return o -> o.get().getClass().getSimpleName().equals(writerTypeMap.get(type));
    }

    public FileWriter getFileWriter(FileWriterType type) {
        ServiceLoader<FileWriter> serviceLoader = ServiceLoader.load(FileWriter.class);
        return serviceLoader.stream()
                .filter(serviceProviderPredicate(type))
                .map(ServiceLoader.Provider::get)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such FileWriter available"));
    }


}
