package com.metrofico.metrofica.log;

public class LogMessage {
    private final String type;
    private final String message;

    public LogMessage(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
