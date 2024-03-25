package org.bridge.messageapps;

import org.bridge.interfaces.MessagingApp;

public class FacebookMessenger implements MessagingApp {

    @Override
    public void sendMessage() {
        System.out.println("Sending message from Facebook Messenger.");
    }
}
