package decorations;
import medias.Media;
public class HighQualityMediaDecorator extends MediaDecorator {

    public HighQualityMediaDecorator(Media media) {
        super(media);
    }
    
    @Override
    public void play() {
        System.out.println("Enhancing media quality...");
        super.play();
    }

}
