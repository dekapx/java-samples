package com.dekapx.java.serviceloader;

import static com.dekapx.java.serviceloader.FileWriterType.CSV;
import static com.dekapx.java.serviceloader.FileWriterType.JSON;
import static com.dekapx.java.serviceloader.FileWriterType.TEXT;
import static com.dekapx.java.serviceloader.FileWriterType.XML;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory.getFileWriter(CSV).write("Sample CSV Contents");
        FileWriterFactory.getFileWriter(TEXT).write("Sample text Contents");
        FileWriterFactory.getFileWriter(XML).write("Sample XML Contents");
        FileWriterFactory.getFileWriter(JSON).write("Sample Json Contents");
    }
}
