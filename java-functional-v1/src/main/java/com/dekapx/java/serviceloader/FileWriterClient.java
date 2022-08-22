package com.dekapx.java.serviceloader;

import static com.dekapx.java.serviceloader.FileWriterType.*;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory.getFileWriter(CSV).write("Sample CSV Contents");
        FileWriterFactory.getFileWriter(TEXT).write("Sample text Contents");
        FileWriterFactory.getFileWriter(XML).write("Sample XML Contents");
    }
}
