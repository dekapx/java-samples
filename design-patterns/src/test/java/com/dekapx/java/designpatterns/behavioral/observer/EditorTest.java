package com.dekapx.java.designpatterns.behavioral.observer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EditorTest {
    private Editor editor;

    @BeforeEach
    public void setup() {
        this.editor = new FileEditor();
    }

    @AfterEach
    public void tearDown() {
        this.editor = null;
    }


    @Test
    @DisplayName("Register Viewer as null and throw Exception")
    public void registerViewerAsNullAndEThrowException() {
        String expectedMessage = "Viewer must not be null or empty";
        assertThatThrownBy(() -> {
            this.editor.registerViewer(null);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage(expectedMessage);

    }

    @Test
    @DisplayName("Register duplicate Viewer and throw Exception")
    public void registerViewerDuplicateAndEThrowException() {
        this.editor.registerViewer(new OutlineViewer());
        this.editor.registerViewer(new PropertyViewer());

        Exception exception = assertThrows(DuplicateViewerException.class, () -> {
            this.editor.registerViewer(new OutlineViewer());
        });
        String expectedMessage = "OutlineViewer is already registered as Viewer";
        assertThat(expectedMessage).isEqualTo(exception.getMessage());
    }

    @Test
    @DisplayName("Register invlid Viewer and throw Exception")
    public void registerViewerAndUpdate() {
        this.editor.registerViewer(new OutlineViewer());
        this.editor.registerViewer(new PropertyViewer());
        this.editor.update(FileInfo.builder()
                .fileName("Test")
                .extension("java")
                .build());
    }
}
