package org.bridge.mediaabstraction;

import org.bridge.interfaces.Media;

public class TextContent implements Media {
    private String textContent;
    @Override
    public void setMediaContent(String content) {
        this.textContent = content;

    }

    @Override
    public String getMediaContent() {
        return this.textContent;
    }
}
