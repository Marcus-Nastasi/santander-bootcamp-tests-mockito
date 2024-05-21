package com.santander.mockito.Domain;

import java.util.ArrayList;
import java.util.List;

public class MessageApp {

    private List<String> message = new ArrayList<>();

    public MessageApp() {}

    public void addMessage(String m) {
        this.message.add(m);
    }

    public List<String> send() {
        return this.message;
    }

    public void removeMessage(String m) {
        this.message.remove(m);
    }

    public List<String> getMessage() {
        return message;
    }
}

