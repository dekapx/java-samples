package com.dekapx.java.designpatterns.command;

public class CreateCommand implements Command<CommandRequest> {
    @Override
    public void execute(final CommandRequest request) {
        System.out.println("Executing CreateCommand...");
        System.out.println(request.getRequestData());
    }
}
