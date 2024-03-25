import org.bridge.mediaabstraction.Image;
import org.bridge.mediaabstraction.Text;
import org.bridge.mediaabstraction.Video;
import org.bridge.messageapps.FacebookMessenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BridgeTest {

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
}
