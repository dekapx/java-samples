package com.dekapx.java.serviceloader;

public class CsvFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println("Write CSV file...");
    }
}
