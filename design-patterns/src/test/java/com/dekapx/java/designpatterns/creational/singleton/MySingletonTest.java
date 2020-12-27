package com.dekapx.java.designpatterns.creational.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MySingletonTest {
    @Test
    @DisplayName("Create and verify Singleton instance")
    public void createAndVerifySingleton() {
        MySingleton singleton = MySingleton.INSTANCE;
        singleton.performAction();
    }
}
