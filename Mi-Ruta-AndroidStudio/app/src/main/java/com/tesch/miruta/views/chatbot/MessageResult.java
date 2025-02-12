package com.tesch.miruta.views.chatbot;

public class MessageResult {
    // Type 0 for sent, 1 for received
    private boolean type;
    // Message content
    private String message;

    public MessageResult(boolean type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public boolean getType() {
        return this.type;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}