package com.dekapx.java.serviceloader;

import static com.dekapx.java.serviceloader.FileWriterType.*;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterFactory.getFileWriter(CSV).write("Sample Contents");
        FileWriterFactory.getFileWriter(TEXT).write("Sample Contents");
        FileWriterFactory.getFileWriter(XML).write("Sample Contents");
    }
}
