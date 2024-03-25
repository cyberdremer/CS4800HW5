package org.bridge.messageapps;

import org.bridge.interfaces.MessagingApp;

public class WhatsApp implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println("Sending the message from WhatsApp: ");

    }
}
