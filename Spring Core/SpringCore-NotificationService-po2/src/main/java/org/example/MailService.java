package org.example;

public class MailService implements SendNotification{
    @Override
    public void sendMessage() {
        System.out.println("Mail Is Sending to the client");
    }
}
