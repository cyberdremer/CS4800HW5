package org.bridge.mediaabstraction;

import org.bridge.interfaces.Media;
import org.bridge.interfaces.MessageType;
import org.bridge.interfaces.MessagingApp;

import java.util.ArrayList;

public class Text implements MessageType {
    private MessagingApp messagingApp;
    private ArrayList<Media> mediaArrayList = new ArrayList<>();
    @Override
    public void setMessageApp(MessagingApp app) {
        this.messagingApp = app;

    }

    @Override
    public void setContent(Media content) {
        if(content instanceof TextContent){
            mediaArrayList.add(content);
        }
        else{
            throw new IllegalArgumentException();
        }



    }



    @Override
    public String getMediaType() {
        return "Text";
    }

    @Override
    public ArrayList<Media> getContent() {
        return this.mediaArrayList;
    }

    @Override
    public void sendMessage() {
        this.messagingApp.sendMessage();
        for (Media media: this.mediaArrayList){
            System.out.println(media.getMediaContent());
        }
        System.out.println("Text Message{s} sent.");


    }
}
