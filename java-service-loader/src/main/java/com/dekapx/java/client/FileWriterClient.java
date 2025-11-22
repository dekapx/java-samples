package com.dekapx.java.client;

import com.dekapx.java.factory.FileWriterFactory;

import static com.dekapx.java.writer.FileWriterType.CSV;
import static com.dekapx.java.writer.FileWriterType.TEXT;
import static com.dekapx.java.writer.FileWriterType.XML;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory factory = new FileWriterFactory();
        factory.getFileWriter(CSV).write("sample.csv", "Hello, World!");
        factory.getFileWriter(TEXT).write("sample.txt", "Hello, World!");
        factory.getFileWriter(XML).write("sample.xml", "Hello, World!");
    }
}
