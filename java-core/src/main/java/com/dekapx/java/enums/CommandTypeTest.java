package com.dekapx.java.enums;

import java.util.Optional;

public class CommandTypeTest {
    public static void main(String[] args) {
        System.out.println(getCommandType("Create"));
        System.out.println(getCommandType("Dummy"));
    }

    private static CommandType getCommandType(final String command) {
        final Optional<CommandType> commandTypeOptional = Optional.ofNullable(CommandType.getKey(command));
        return commandTypeOptional.orElseThrow(() -> new IllegalArgumentException("Invalid Command."));
    }
}
