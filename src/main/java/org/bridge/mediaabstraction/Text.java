package org.bridge.mediaabstraction;

import org.bridge.Media;
import org.bridge.interfaces.MessageType;
import org.bridge.interfaces.MessagingApp;

import java.util.ArrayList;

public class Text implements MessageType {
    MessagingApp messagingApp;
    @Override
    public void setMessageApp(MessagingApp app) {
        this.messagingApp = app;

    }

    @Override
    public void setContent(Media media) {

    }

    @Override
    public String getMediaType() {
        return "Text";
    }

    @Override
    public ArrayList<MessageType> getContent() {
        return null;
    }

    @Override
    public void sendMessage() {
        this.messagingApp.sendMessage();
        System.out.println("Text message sent.");


    }
}
