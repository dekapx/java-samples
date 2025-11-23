package com.dekapx.java.client;

import com.dekapx.java.factory.FileWriterFactory;

import static com.dekapx.java.writer.FileWriterType.CSV;
import static com.dekapx.java.writer.FileWriterType.TEXT;
import static com.dekapx.java.writer.FileWriterType.XML;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory.getFileWriter(CSV).write("sample.csv", "Hello, World!");
        FileWriterFactory.getFileWriter(TEXT).write("sample.txt", "Hello, World!");
        FileWriterFactory.getFileWriter(XML).write("sample.xml", "Hello, World!");
    }
}
