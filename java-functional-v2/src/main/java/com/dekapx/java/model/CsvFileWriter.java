package com.dekapx.java.model;

public final class CsvFileWriter implements FileWriter {
    @Override
    public void write(String fileName, String content) {
        System.out.println("Writing CSV file: " + fileName);
    }
}
