package org.example;

public class SmsService implements SendNotification{
    @Override
    public void sendMessage() {

        System.out.println("SMS Is Sending to the client");
    }
}
