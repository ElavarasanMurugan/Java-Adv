package com.example.springmvcapp.model;

public class WelcomeMessage {
    private final String message;

    public WelcomeMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
