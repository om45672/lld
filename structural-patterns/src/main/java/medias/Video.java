package medias;

public class Video implements Media {
    private String filename;

    public Video(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + filename);
    }

}
