package com.dekapx.java.writer;

public final class XmlFileWriter implements FileWriter {
    @Override
    public void write(String filePath, String content) {
        System.out.println("Writing XML file: " + filePath);
    }
}
