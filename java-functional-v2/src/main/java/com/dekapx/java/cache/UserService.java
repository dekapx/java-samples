package com.dekapx.java.cache;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public List<User> loadUsers() {
        System.out.println("Loading all users from DB...");
        List<User> users = new ArrayList<>();
        users.add(User.builder()
                .id(1L)
                .name("John Doe")
                .email("John.Doe@outlook.com")
                .build());
        return users;
    }

    public User loadUser(Long id) {
        System.out.println("Loading user from DB...");
        simulateSlowOperation();
        return User.builder()
                .id(id)
                .name("John Doe")
                .email("John.Doe@outlook.com")
                .build();
    }

    private void simulateSlowOperation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
