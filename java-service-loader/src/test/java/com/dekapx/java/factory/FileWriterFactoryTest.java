package com.dekapx.java.factory;

import com.dekapx.java.writer.CsvFileWriter;
import com.dekapx.java.writer.FileWriter;
import com.dekapx.java.writer.FileWriterType;
import com.dekapx.java.writer.TextFileWriter;
import com.dekapx.java.writer.XmlFileWriter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FileWriterFactoryTest {
    @ParameterizedTest
    @EnumSource(FileWriterType.class)
    public void shouldReturnFileWriterInstanceForGivenFileWriterType(FileWriterType type) {
        FileWriter writer = FileWriterFactory.getFileWriter(type);
        assertThat(writer)
                .isNotNull()
                .isInstanceOfAny(
                        CsvFileWriter.class,
                        TextFileWriter.class,
                        XmlFileWriter.class);
    }
}
