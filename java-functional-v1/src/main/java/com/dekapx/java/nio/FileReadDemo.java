package com.dekapx.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        final Path filePath = Paths.get("./src/main/resources/temp/sample.txt");
        String contents = Files.readString(filePath);
        System.out.println(contents);
    }
}
