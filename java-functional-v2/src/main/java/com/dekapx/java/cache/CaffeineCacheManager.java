package com.dekapx.java.cache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CaffeineCacheManager {
    private static final String CACHE_KEY = "ALL_USERS";
    private UserService userService;

    private static final Cache<String, List<User>> cache = Caffeine.newBuilder()
            .initialCapacity(5)
            .maximumSize(10)
            .expireAfterWrite(5, TimeUnit.SECONDS)
            .recordStats()
            .build();

    public CaffeineCacheManager() {
        userService = new UserService();
        List<User> users = userService.loadUsers();
        cache.put(CACHE_KEY, users);
    }

    public List<User> getUsers() {
        return cache.get(CACHE_KEY, key -> userService.loadUsers());
    }
}
