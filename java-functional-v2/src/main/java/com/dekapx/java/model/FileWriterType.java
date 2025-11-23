package com.dekapx.java.model;

import static com.dekapx.java.utils.BeanUtils.createInstance;

public enum FileWriterType {
    CSV {
        @Override
        public FileWriter build() {
            return createInstance(CsvFileWriter.class);
        }
    },
    TEXT {
        @Override
        public FileWriter build() {
            return createInstance(TextFileWriter.class);
        }
    },
    XML {
        @Override
        public FileWriter build() {
            return createInstance(XmlFileWriter.class);
        }
    };

    public abstract FileWriter build();
}
