package com.dekapx.java.client;

import com.dekapx.java.factory.FileWriterFactory;
import com.dekapx.java.writer.FileWriter;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriterFactory().getFileWriter();
        fileWriter.write("sample.csv", "Hello, World!");
    }
}
