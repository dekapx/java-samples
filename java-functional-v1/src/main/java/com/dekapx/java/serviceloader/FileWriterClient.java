package com.dekapx.java.serviceloader;

import static com.dekapx.java.serviceloader.FileWriterType.*;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory.getFileWriter(CSV).write("Test");
        FileWriterFactory.getFileWriter(TEXT).write("Test");
        FileWriterFactory.getFileWriter(XML).write("Test");
    }
}
