package org.bridge.driver;

import org.bridge.mediaabstraction.*;
import org.bridge.messageapps.FacebookMessenger;
import org.bridge.messageapps.Telegram;
import org.bridge.messageapps.WhatsApp;

public class Main {
    public static void main(String[] args){
        sendWhatsAppImage();
        sendWhatsAppVideo();
        sendWhatsAppText();

        sendFBImage();
        sendFBText();
        sendFBVideo();

        sendTelegramImage();
        sendTelegramText();
        sendTelegramVideo();

    }

    public static void sendTelegramImage(){
        ImageContent imageOne = new ImageContent();
        Image images = new Image();
        Telegram telegram = new Telegram();

        imageOne.setMediaContent("Cat.png");
        images.setContent(imageOne);
        images.setMessageApp(telegram);

        images.sendMessage();

    }

    public static void sendTelegramVideo(){
        VideoContent videoOne = new VideoContent();
        Video videos = new Video();
        Telegram telegram = new Telegram();

        videoOne.setMediaContent("Cat.mp4");
        videos.setContent(videoOne);
        videos.setMessageApp(telegram);

        videos.sendMessage();

    }

    public static void sendTelegramText(){
        TextContent textOne = new TextContent();
        Text texts =new Text();
        Telegram telegram = new Telegram();

        textOne.setMediaContent("Hello, how are you");
        texts.setContent(textOne);
        texts.setMessageApp(telegram);

        texts.sendMessage();
    }

    public static void sendWhatsAppImage(){
        ImageContent imageOne = new ImageContent();
        Image images = new Image();
        WhatsApp whatsApp = new WhatsApp();

        imageOne.setMediaContent("Cat.png");
        images.setContent(imageOne);
        images.setMessageApp(whatsApp);

        images.sendMessage();

    }

    public static void sendWhatsAppVideo(){
        VideoContent videoOne = new VideoContent();
        Video videos = new Video();
        WhatsApp whatsApp = new WhatsApp();

        videoOne.setMediaContent("Cat.mp4");
        videos.setContent(videoOne);
        videos.setMessageApp(whatsApp);

        videos.sendMessage();

    }

    public static void sendWhatsAppText(){
        TextContent textOne = new TextContent();
        Text texts =new Text();
        WhatsApp whatsApp = new WhatsApp();

        textOne.setMediaContent("Hello, how are you");
        texts.setContent(textOne);
        texts.setMessageApp(whatsApp);

        texts.sendMessage();
    }


    public static void sendFBImage(){
        ImageContent imageOne = new ImageContent();
        Image images = new Image();
        WhatsApp whatsApp = new WhatsApp();

        imageOne.setMediaContent("Cat.png");
        images.setContent(imageOne);
        images.setMessageApp(whatsApp);

        images.sendMessage();

    }

    public static void sendFBVideo(){
        VideoContent videoOne = new VideoContent();
        Video videos = new Video();
        FacebookMessenger facebookMessenger = new FacebookMessenger();

        videoOne.setMediaContent("Cat.mp4");
        videos.setContent(videoOne);
        videos.setMessageApp(facebookMessenger);

        videos.sendMessage();

    }

    public static void sendFBText(){
        TextContent textOne = new TextContent();
        Text texts =new Text();
        FacebookMessenger facebookMessenger = new FacebookMessenger();

        textOne.setMediaContent("Hello, how are you");
        texts.setContent(textOne);
        texts.setMessageApp(facebookMessenger);

        texts.sendMessage();
    }
}
