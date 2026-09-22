package com;

import medias.Audio;
import decorations.HighQualityMediaDecorator;
import medias.Image;
import medias.ImageAdapter;
import medias.Media;
import utility.MediaCollection;
import medias.Video;

public class MultimediaApp {
    public static void main(String[] args) {
        // Create individual media objects
        Media audio = new Audio("song.mp3");
        Media video = new Video("movie.mp4");
        Media image = new ImageAdapter(new Image("picture.jpg"));

        // Create a media collection
        Media[] mediaArray = { audio, video, image };
        MediaCollection mediaCollection = new MediaCollection(mediaArray);

        // Play the media collection
        System.out.println("Playing media collection:");
        mediaCollection.play();

        // Decorate the media with high quality
        Media highQualityAudio = new HighQualityMediaDecorator(audio);
        Media highQualityVideo = new HighQualityMediaDecorator(video);

        // Play the decorated media
        System.out.println("\nPlaying high-quality audio:");
        highQualityAudio.play();

        System.out.println("\nPlaying high-quality video:");
        highQualityVideo.play();
    }
}
