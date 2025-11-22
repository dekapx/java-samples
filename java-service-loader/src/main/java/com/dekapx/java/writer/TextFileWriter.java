package com.dekapx.java.writer;

public final class TextFileWriter implements FileWriter {
    @Override
    public void write(String filePath, String content) {
        System.out.println("Writing TEXT file: " + filePath);
    }
}
