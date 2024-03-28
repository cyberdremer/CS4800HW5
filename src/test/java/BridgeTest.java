import org.bridge.interfaces.Media;
import org.bridge.mediaabstraction.*;
import org.bridge.messageapps.FacebookMessenger;
import org.bridge.messageapps.WhatsApp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class BridgeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testTextMediaType(){
        Text text = new Text();
        String testText = "Text";
        assertSame(testText, text.getMediaType());
    }

    @Test
    public void testImageMediaType(){
        Image image = new Image();
        String testText = "Image";
        assertSame(testText, image.getMediaType());
    }

    @Test
    public void testVideoMediaType(){
        Video video = new Video();
        String testText = "Video";
        assertSame(testText, video.getMediaType());
    }


    @Test
    public void setImageContent(){
        ImageContent imageContent = new ImageContent();
        String content = "Image content";
        imageContent.setMediaContent("Image content");
        assertSame(content, imageContent.getMediaContent());
    }

    @Test
    public void setVideoContent(){
        VideoContent videoContent = new VideoContent();
        String content = "Video content";
        videoContent.setMediaContent("Video content");
        assertSame(content, videoContent.getMediaContent());
    }

    @Test
    public void setTextContent(){
        TextContent textContent = new TextContent();
        String content = "Text content";
        textContent.setMediaContent("Text content");
        assertSame(content, textContent.getMediaContent());
    }


    @Test
    public void setCorrectContentText(){
        TextContent textContent = new TextContent();
        Text testText = new Text();
        assertDoesNotThrow( ()->testText.setContent(textContent));


    }


    @Test
    public void setIncorrectContentText(){
        ImageContent imageContent = new ImageContent();
        Text testText = new Text();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->testText.setContent(imageContent));

    }


    @Test
    public void setCorrectContentImage(){
        ImageContent imageContent = new ImageContent();
        Image testImage = new Image();
        assertDoesNotThrow( ()->testImage.setContent(imageContent));

    }

    @Test
    public void setIncorrectContentImage(){
        VideoContent imageContent = new VideoContent();
        Image imageTest = new Image();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->imageTest.setContent(imageContent));

    }


    @Test
    public void setCorrectContentVideo(){
        VideoContent videoContent = new VideoContent();
        Video videoTest = new Video();
        assertDoesNotThrow( ()->videoTest.setContent(videoContent));

    }

    @Test
    public void setIncorrectContentVideo(){
        TextContent videoContent = new TextContent();
        Video videoTest = new Video();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->videoTest.setContent(videoContent));

    }

    @Test
    public void addContentText(){
        Text text = new Text();
        ArrayList<Media> mediaArrayList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++){

            mediaArrayList.add(new TextContent());
            mediaArrayList.get(i).setMediaContent("This is the " + i + "image.");
            text.setContent(mediaArrayList.get(i));
        }

        Assertions.assertArrayEquals(mediaArrayList.toArray(), text.getContent().toArray());
    }


    @Test
    public void addContentImage(){
        Image image = new Image();
        ArrayList<Media> mediaArrayList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++){

            mediaArrayList.add(new TextContent());
            mediaArrayList.get(i).setMediaContent("This is the " + i + "image.");
            image.setContent(mediaArrayList.get(i));
        }

        Assertions.assertArrayEquals(mediaArrayList.toArray(), image.getContent().toArray());
    }

    @Test
    public void addContentVideo(){
        Video video = new Video();
        ArrayList<Media> mediaArrayList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++){

            mediaArrayList.add(new TextContent());
            mediaArrayList.get(i).setMediaContent("This is the " + i + "image.");
            video.setContent(mediaArrayList.get(i));
        }

        Assertions.assertArrayEquals(mediaArrayList.toArray(), video.getContent().toArray());
    }







}
