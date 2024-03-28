package org.bridge.interfaces;

import org.bridge.mediaabstraction.ImageContent;

import java.util.ArrayList;

public interface MessageType {
    public void setMessageApp(MessagingApp app);
    public void setContent(Media media);


    public String getMediaType();

    public ArrayList<Media> getContent();

    public void sendMessage();
}
