package com.dekapx.java.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserService {
    public List<User> loadUsers() {
        System.out.println("Loading all users from DB...");
        simulateSlowOperation();
        List<User> users = List.of(
                User.builder()
                        .id(1L)
                        .name("John Doe")
                        .email("John.Doe@outlook.com")
                        .build(),
                User.builder()
                        .id(2L)
                        .name("Jane Smith")
                        .email("Jane.Smith@google.com")
                        .build(),
                User.builder()
                        .id(3L)
                        .name("Bob Johnson")
                        .email("Bob.Johnson@microsoft.com")
                        .build()
        );
        return users;
    }

    public User loadUser(Long aLong) {
        return User.builder()
                .id(1L)
                .name("John Doe")
                .email("John.Doe@outlook.com")
                .build();
    }

    private void simulateSlowOperation() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
