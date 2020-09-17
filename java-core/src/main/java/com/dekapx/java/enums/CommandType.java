package com.dekapx.java.enums;

import java.util.HashMap;
import java.util.Map;

public enum CommandType {
    CREATE_COMMAND("Create"),
    SAVE_COMMAND("Save"),
    UPDATE_COMMAND("Update"),
    DELETE_COMMAND("Delete");

    private String value;
    private static final Map<String, CommandType> commandTypes = new HashMap<>();

    static {
        for (CommandType commandType : CommandType.values()) {
            commandTypes.put(commandType.toString(), commandType);
        }
    }

    CommandType(final String value) {
        this.value = value;
    }

    public static CommandType getKey(final String value) {
        return commandTypes.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
