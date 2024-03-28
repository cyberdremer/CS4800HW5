package org.bridge.mediaabstraction;

import org.bridge.interfaces.Media;

import java.util.Map;

public class ImageContent implements Media {
    private String imageContent;
    @Override
    public void setMediaContent(String content) {
        this.imageContent = content;

    }

    @Override
    public String getMediaContent() {
        return imageContent;
    }
}
