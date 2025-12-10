package com.dekapx.java.factory;

import com.dekapx.java.model.CsvFileWriter;
import com.dekapx.java.model.FileWriter;
import com.dekapx.java.model.FileType;
import com.dekapx.java.model.TextFileWriter;
import com.dekapx.java.model.XmlFileWriter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FileWriterFactoryTest {
    @ParameterizedTest
    @EnumSource(FileType.class)
    public void shouldReturnFileWriterInstanceForGivenFileType(FileType type) {
        FileWriter writer = FileWriterFactory.getFileWriter(type);
        assertThat(writer)
                .isNotNull()
                .isInstanceOfAny(expectedClassFor(type));
    }

    private Class<?> expectedClassFor(FileType type) {
        return switch (type) {
            case CSV -> CsvFileWriter.class;
            case TEXT -> TextFileWriter.class;
            case XML -> XmlFileWriter.class;
        };
    }
}
