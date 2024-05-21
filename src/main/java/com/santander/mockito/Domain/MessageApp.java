package com.santander.mockito.Domain;

import java.util.ArrayList;
import java.util.List;

public class MessageApp {

    private List<String> message = new ArrayList<>();

    public MessageApp() {}

    public void send() {
        System.out.println(this.message);
    }
}
