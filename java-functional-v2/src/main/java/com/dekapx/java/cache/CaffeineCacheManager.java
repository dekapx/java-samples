package com.dekapx.java.cache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CaffeineCacheManager {
    private static final Cache<Long, User> cache = Caffeine.newBuilder()
            .initialCapacity(100)
            .maximumSize(1_000)
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .recordStats()
            .build();

    static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.loadUsers();

        Map<Long, User> usersMap = users.stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));
        cache.putAll(usersMap);

        System.out.println("Cache size: " + cache.estimatedSize());
        User user1 = cache.get(1L, userService::loadUser);
        System.out.println(user1);

        System.out.println("Cache size: " + cache.estimatedSize());
        System.out.println("Stats: " + cache.stats());
    }
}
