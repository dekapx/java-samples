package com.dekapx.java.concurrency;

import jdk.incubator.concurrent.StructuredTaskScope;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

record HelloWorld(String arg1, String arg2) {}

public class StructuredTaskScopeDemo {
    public static void main(String[] args) throws Exception {
        HelloWorld helloWorld = invokeHelloWorld();
        System.out.println(helloWorld.arg1() + helloWorld.arg2());
    }

    private static HelloWorld invokeHelloWorld() throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<String> helloFuture = scope.fork(() -> invokeHello());
            Future<String> worldFuture = scope.fork(() -> invokeWorld());
            
            scope.join();
            scope.throwIfFailed();

            String arg1 = helloFuture.resultNow();
            String arg2 = worldFuture.resultNow();
            return new HelloWorld(arg1, arg2);
        }
    }

    private static String invokeHello() {
        return "Hello";
    }

    private static String invokeWorld() {
        return "World";
    }

}
