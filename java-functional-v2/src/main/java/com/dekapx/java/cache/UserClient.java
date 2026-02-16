package com.dekapx.java.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class UserClient {
    static void main() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();

        IntStream.range(0, 10).forEach(i -> {
            List<User> users = cacheManager.getUsers();
            users.forEach(user -> {
                System.out.println(user.getName() + " - " + user.getEmail());
            });
            simulateSlowOperation();
        });
    }

    private static void simulateSlowOperation() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
