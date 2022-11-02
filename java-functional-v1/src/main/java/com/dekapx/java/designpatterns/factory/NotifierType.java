package com.dekapx.java.designpatterns.factory;

public enum NotifierType {
    EMAIL {
        @Override
        public Notifier build() {
            return createInstance(EmailNotifier.class);
        }
    },
    TEXT {
        @Override
        public Notifier build() {
            return createInstance(TextNotifier.class);
        }
    };

    public abstract Notifier build();

    private static <T> T createInstance(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance...");
        }
    }
}
