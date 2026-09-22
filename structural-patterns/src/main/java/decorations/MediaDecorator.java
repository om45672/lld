package decorations;
import medias.Media;

public abstract class MediaDecorator implements Media {
    protected Media media;

    public MediaDecorator(Media media) {
        this.media = media;
    }

    @Override
    public void play() {
        media.play();
    }

}
