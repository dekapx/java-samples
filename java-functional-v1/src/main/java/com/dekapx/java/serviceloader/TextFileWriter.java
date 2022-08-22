package com.dekapx.java.serviceloader;

public final class TextFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println(String.format("Text -> [%s]", contents));
    }
}
