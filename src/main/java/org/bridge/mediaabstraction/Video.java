package org.bridge.mediaabstraction;

import org.bridge.Media;
import org.bridge.interfaces.MessageType;
import org.bridge.interfaces.MessagingApp;

import java.util.ArrayList;

public class Video implements MessageType {
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
        return "Video";
    }

    @Override
    public ArrayList<MessageType> getContent() {
        return null;
    }

    @Override
    public void sendMessage() {
        this.messagingApp.sendMessage();
        System.out.println("Video sent.");

    }
}
