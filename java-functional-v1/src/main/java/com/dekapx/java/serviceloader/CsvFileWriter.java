package com.dekapx.java.serviceloader;

public final class CsvFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println(String.format("CSV -> [%s]", contents));
    }
}
