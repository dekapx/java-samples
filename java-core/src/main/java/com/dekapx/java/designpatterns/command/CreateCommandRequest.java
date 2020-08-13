package com.dekapx.java.designpatterns.command;

public class CreateCommandRequest implements CommandRequest<String> {
    private String requestData;

    public CreateCommandRequest(final String requestData) {
        this.requestData = requestData;
    }

    @Override
    public String getRequestData() {
        return this.requestData;
    }
}
