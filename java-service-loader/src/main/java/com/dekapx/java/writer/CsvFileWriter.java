package com.dekapx.java.writer;

public class CsvFileWriter implements FileWriter {
    @Override
    public void write(String fileName, String content) {
        System.out.println("Writing CSV file: " + fileName);
    }
}
