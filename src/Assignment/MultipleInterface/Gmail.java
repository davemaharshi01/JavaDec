package Assignment.MultipleInterface;

public class Gmail extends Features implements Website, MobileApp {

    @Override
    void post() {

    }

    @Override
    void surf() {

    }

    @Override
    void Message() {
        System.out.println("Gmail is email service provider by Google and it's the most used email platform ever been");
    }

    @Override
    public void useAnytime() {
        System.out.println("They have their phone app as well so you can access your emails anytime");
    }

    @Override
    public void publishData() {
        System.out.println("Gmail is widely used to share an important details and you can send and receive emails including limited size of pictures, videos and all format files");
    }
}
