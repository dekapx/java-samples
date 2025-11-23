package com.dekapx.java.model;

public final class XmlFileWriter implements FileWriter {
    @Override
    public void write(String filePath, String content) {
        System.out.println("Writing XML file: " + filePath);
    }
}
