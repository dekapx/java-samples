package com.dekapx.java.serviceloader;

public final class XmlFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println(String.format("XML -> [%s]", contents));
    }
}
