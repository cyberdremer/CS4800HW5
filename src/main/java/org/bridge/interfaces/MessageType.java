package org.bridge.interfaces;

import org.bridge.Media;

import java.util.ArrayList;

public interface MessageType {
    public void setMessageApp(MessagingApp app);
    public void setContent(Media media);

    public String getMediaType();

    public ArrayList<MessageType> getContent();

    public void sendMessage();
}
