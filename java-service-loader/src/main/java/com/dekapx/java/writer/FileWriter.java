package com.dekapx.java.writer;

public sealed interface FileWriter
        permits TextFileWriter, CsvFileWriter, XmlFileWriter {
    void write(String fileName, String content);
}
