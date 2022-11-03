package com.dekapx.java.designpatterns.factory;

import static com.dekapx.java.designpatterns.factory.BeanUtils.createInstance;

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
}
