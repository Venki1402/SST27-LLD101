package com.example.notifications;

public class SmsDecorator implements Notifier {
    Notifier notifier;
    private final String phoneNumber;

    SmsDecorator(Notifier notifier, String phoneNumber) {
        this.notifier = notifier;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        this.notifier.notify(text);
        System.out.println("[SMS -> " + phoneNumber + "]: " + text);
    }
}
