package utility;
import medias.Media;

/*
    * Made use of composite design pattern
*/

public class MediaCollection implements Media {
    private Media[] mediaArray;

    public MediaCollection(Media[] mediaArray) {
        this.mediaArray = mediaArray;
    }

    @Override
    public void play() {
        for (Media media : mediaArray) {
            media.play();
        }
    }
}
