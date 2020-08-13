package com.dekapx.java.designpatterns.command;

public class Client {
    public static void main(String[] args) {
    }

    private static CommandRequest<String> createRequest(String requestData) {
        return new CreateCommandRequest(requestData);
    }
}
