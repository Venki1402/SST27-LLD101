package com.example.notifications;

public class WhatsAppDecorator implements Notifier {
    Notifier notifier;
    private final String phoneNumber;

    WhatsAppDecorator(Notifier notifier, String phoneNumber) {
        this.notifier = notifier;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        this.notifier.notify(text);
        System.out.println("[WhatsApp -> " + phoneNumber + "]: " + text);
    }
}
