package com.dekapx.java.serviceloader;

public final class JsonFileWriter implements FileWriter {
    @Override
    public void write(final String contents) {
        System.out.println(String.format("Json -> [%s]", contents));
    }
}
