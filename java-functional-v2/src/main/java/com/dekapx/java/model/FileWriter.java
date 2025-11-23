package com.dekapx.java.model;

public sealed interface FileWriter
        permits TextFileWriter, CsvFileWriter, XmlFileWriter {
    void write(String fileName, String content);
}
