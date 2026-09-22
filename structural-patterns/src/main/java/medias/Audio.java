package medias;

public class Audio implements Media {
    private String filename;

    public Audio(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + filename);
    }

}
