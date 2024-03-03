package Assignment.Interfaces;

public class AudioPlayer extends MediaDevice implements Playable {

    String songName;
    String artist;

    public AudioPlayer(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void displayDetails(String name) {
        super.displayDetails(name);
    }

    @Override
    public void play(String songName, String artist) {
        System.out.println("The Song name is: " + songName);
        System.out.println("The artis name is: "+ artist);
    }
}
