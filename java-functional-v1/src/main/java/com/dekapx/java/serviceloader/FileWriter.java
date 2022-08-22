package com.dekapx.java.serviceloader;

public sealed interface FileWriter
        permits CsvFileWriter, TextFileWriter, XmlFileWriter {
    void write(String contents);
}
