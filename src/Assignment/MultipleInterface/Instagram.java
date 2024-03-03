package Assignment.MultipleInterface;

public class Instagram extends Features implements SocialMedia, MobileApp {
    @Override
    void post() {
        System.out.println("You can post pictures, videos, short-videos(reels) and you can include captions with emojis");
    }

    @Override
    void surf() {
        System.out.println("On Instagram you can socialize with your friends and family and able to see their posts");
    }

    @Override
    void Message() {
        System.out.println("On instagram you can not only send a message but you can also share posts of other content creators and celebrities");
    }

    @Override
    public void useAnytime() {
        System.out.println("Instagram has their app for both ios and android user an you can access anytime from your devices ");
    }

    @Override
    public void socializeWithPeople() {
        System.out.println("Instagram is a Next-gen social medial platform where you can post and earn depending on the level of views and like you get on your posts");
    }
}
