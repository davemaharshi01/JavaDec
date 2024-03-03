package Assignment.Interfaces;

public class VideoPlayer extends MediaDevice {

    String videoTitle;
    int duration;


    public VideoPlayer(String videoTitle, int duration) {
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    @Override
    public void displayDetails(String name) {
        super.displayDetails(name);
    }



}
