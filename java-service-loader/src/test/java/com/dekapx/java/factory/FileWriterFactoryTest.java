package com.dekapx.java.factory;

import com.dekapx.java.writer.FileWriter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FileWriterFactoryTest {
    @Test
    public void testGetFileWriter() {
        FileWriterFactory factory = new FileWriterFactory();
        FileWriter fileWriter = factory.getFileWriter();
        assertThat(fileWriter).isNotNull();
    }
}
