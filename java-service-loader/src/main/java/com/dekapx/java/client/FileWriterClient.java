package com.dekapx.java.client;

import com.dekapx.java.factory.FileWriterFactory;

import static com.dekapx.java.writer.FileType.CSV;
import static com.dekapx.java.writer.FileType.TEXT;
import static com.dekapx.java.writer.FileType.XML;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory.getFileWriter(CSV).write("sample.csv", "Hello, World!");
        FileWriterFactory.getFileWriter(TEXT).write("sample.txt", "Hello, World!");
        FileWriterFactory.getFileWriter(XML).write("sample.xml", "Hello, World!");
    }
}
