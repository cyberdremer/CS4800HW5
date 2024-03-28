package org.bridge.messageapps;

import org.bridge.interfaces.MessagingApp;

public class Telegram implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println("Sending message{s} from Telegram");
    }
}
