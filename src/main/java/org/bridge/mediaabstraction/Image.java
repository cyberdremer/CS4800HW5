package org.bridge.mediaabstraction;

import org.bridge.interfaces.Media;
import org.bridge.interfaces.MessageType;
import org.bridge.interfaces.MessagingApp;

import java.util.ArrayList;

public class Image implements MessageType {
    private MessagingApp messagingApp;
    private ArrayList<Media> mediaArrayList = new ArrayList<>();
    @Override
    public void setMessageApp(MessagingApp app) {
        this.messagingApp = app;


    }

    @Override
    public void setContent(Media media) {
        if(media instanceof ImageContent){
            this.mediaArrayList.add(media);
        }
        else{
            throw new IllegalArgumentException();
        }

    }


    @Override
    public String getMediaType() {
        return "Image";
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
        System.out.println("Image message{s} sent.");

    }
}
