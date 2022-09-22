package com.dekapx.java.serviceloader;

/**
 * Service: represents an interface
 * Service Provider: an implementation of service
 * ServiceLoader: locate and load service providers that implement a given service
 */
public sealed interface FileWriter
        permits CsvFileWriter, TextFileWriter, XmlFileWriter {
    void write(String contents);
}
