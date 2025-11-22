package com.dekapx.java.writer;

public class XmlFileWriter implements FileWriter {
    @Override
    public void write(String filePath, String content) {
        System.out.println("Writing XML file: " + filePath);
    }
}
