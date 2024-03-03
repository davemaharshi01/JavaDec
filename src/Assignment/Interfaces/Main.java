package Assignment.Interfaces;

import Feb13.Abstraction.Address;

public class Main extends AudioPlayer {
    public Main(String songName, String artist) {
        super(songName, artist);
    }

    public static void main(String[] args) {
        AudioPlayer ad = new AudioPlayer("Kill Bill","SZA");

        VideoPlayer vd = new VideoPlayer("Kill Bill", 4);
        vd.displayDetails("Sony");
        String videoTitle = vd.videoTitle;
        int duration = vd.duration;
        System.out.println("Playing the song: "+ vd.videoTitle + " and the song duration(Minutes) is: " + vd.duration);
        System.out.println("Video Title: " +videoTitle);
        System.out.println("Song Duration in minutes: " +duration);

        System.out.println();

        ad.displayDetails("Sony");
        ad.play("Kill Bill", "SZA");
    }
}
