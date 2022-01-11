package com.dekapx.java.basics;

sealed interface FileWriter permits CsvWriter, TextWriter{
    void write();
}

final class CsvWriter implements FileWriter {
    @Override
    public void write() {}
}

final class TextWriter implements FileWriter {
    @Override
    public void write() {}
}

/** not allowed
final class XmlWriter implements FileWriter {
    @Override
    public void write() {}
}   **/

public class SealedObjectsDemo {
}
