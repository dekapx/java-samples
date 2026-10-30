package com.dekapx.java.cache;

import com.github.benmanes.caffeine.cache.AsyncCache;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CaffeineAsyncCacheManager {
    private static final String CACHE_KEY = "ALL_USERS";
    private UserService userService;

    private final AsyncCache<String, List<User>> cache = Caffeine.newBuilder()
            .initialCapacity(5)
            .maximumSize(10)
            .expireAfterWrite(5, TimeUnit.SECONDS)
            .recordStats()
            .buildAsync((key, executor) ->
                    CompletableFuture.supplyAsync(() -> loadUsers(), executor));

    public CaffeineAsyncCacheManager() {
        this.userService = new UserService();
        List<User> users = this.userService.loadUsers();
        cache.put(CACHE_KEY, CompletableFuture.completedFuture(users));
    }

    public List<User> getUsers() {
        System.out.println("Cache size: " + cache.synchronous().estimatedSize());
        CompletableFuture<List<User>> completableFuture = cache.get(CACHE_KEY, key -> userService.loadUsers());
        return completableFuture.join();
    }

    private List<User> loadUsers() {
        return this.userService.loadUsers();
    }
}
