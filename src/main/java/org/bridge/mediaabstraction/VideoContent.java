package org.bridge.mediaabstraction;

import org.bridge.interfaces.Media;

public class VideoContent implements Media {
    private String videoContent;
    @Override
    public void setMediaContent(String content) {
        this.videoContent = content;

    }

    @Override
    public String getMediaContent() {
        return videoContent;
    }
}
