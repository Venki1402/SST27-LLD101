package com.example.notifications;

public class SlackDecorator implements Notifier {
    Notifier notifier;
    private final String slackId;

    SlackDecorator(Notifier notifier, String slackId) {
        this.notifier = notifier;
        this.slackId = slackId;
    }

    @Override
    public void notify(String text) {
        this.notifier.notify(text);
        System.out.println("[SLACK -> " + slackId + "]: " + text);
    }

}
